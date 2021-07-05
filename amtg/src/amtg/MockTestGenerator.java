package amtg;


import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.*;



public class MockTestGenerator {




public static void main(String[] args) throws Exception {

	try {
	File f=new File("Test2.amtg");
	MockTestGenerator cg=new MockTestGenerator();
	TestCase t1=cg.loadTestModel(f);
	//System.out.println(t1.getTestmethod().get(0).getName());
	String test_code=cg.generateTestCode(t1);
	System.out.println(test_code);
	} catch (Exception e)
	{
		System.out.println(e.getMessage());
		
	}
			
}


public String generateTestCode(TestCase tc)
{
	String code="";
	int i,j,k,l;
	String test_name=tc.getName();
	for(i=0;i<tc.getTestmethod().size();i++)
	{
		String part1="", part2="", part3="", part4;
		TestMethod tm=tc.getTestmethod().get(i);
		part1="TEST("+tc.getName()+", "+tm.getName()+"){";
		List<MockObject> mock_list=tm.getMockobject();
		for(j=0;j<mock_list.size();j++)
		{
			part2=part2+mock_list.get(j).getType()+" "+mock_list.get(j).getName()+";\n";
			
		}
		List <Expectation> expectation_list=tm.getExpectation();
		System.out.println("velicina:"+expectation_list.size());
		for(k=0;k<expectation_list.size();k++)
		{
			Expectation e=expectation_list.get(k);
			part3=part3+"EXPECT_CALL("+e.getMethodName()+","+e.getMockobject().getType() +")."+e.getType()+"("+e.getParameter()+"); \n";
		}
		
		RealObject r=tc.getTestmethod().get(i).getRealobject().get(0);
		part4=r.getType()+"(";
		for(j=0;j<mock_list.size();j++)
		{
			part4=part4+"&"+mock_list.get(j).getName();
			if(j!=mock_list.size()-1)
			{
				part4=part4+",";
			}
					
		}	
		part4=part4+") "+r.getName()+";";
				
		code=part1+"\n"+part2+part3+"\n"+part4;

	}
	return code;
	
	
}


public TestCase loadTestModel(File java2kdmModelFile) throws IOException{

			// check that the file is accessible
			if (!java2kdmModelFile.canRead()) {
				throw new IOException("cannot read model file "+ java2kdmModelFile);
			}
		    
		    // load the required meta class packages
		    AmtgPackage.eINSTANCE.eClass();

		    // register the factory to be able to read xmi files
		    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		    				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		    
		    // load the resource and resolve the proxies
		    ResourceSet rs = new ResourceSetImpl();
		    Resource r = rs.createResource(URI.createFileURI(java2kdmModelFile.getAbsolutePath()));
		    r.load(null);
		    EcoreUtil.resolveAll(rs);
		    
		    // convert the model to a java model
		    EObject model = r.getContents().get(0);
		    if(!(model instanceof TestCase)){
		      throw new IllegalArgumentException("Model is not a JavaApplication: "+model.getClass().getName());
		    }
			TestCase javaApplicationModel = (TestCase)model;
		    
		    return javaApplicationModel;
		  }
	
}
	
	

