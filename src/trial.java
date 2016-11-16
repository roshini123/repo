// 111. ExcessiveImports
import java.io.*;
// 91. DontImportJavaLang
import java.lang.reflect.AccessibleObject;
// 92. DontImportSun
import sun.misc.*;
// 95. DuplicateImports
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.PrivilegedAction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import javax.Ejb.EJBLocalHome;
// 245. UnusedImports
import java.io.File;
import java.lang.ThreadGroup;
import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import static org.junit.Assert.*;
// 19. AvoidConstantsInterface
// 78. ConstantsInInterface
interface ConstantsInterface {
	   public static final int CONSTANT1=0;
	   // 247. UnusedModifier
	   public static final String CONSTANT2="1";
	}  

abstract class Foo {
	//1. AbstractClassWithoutAbstractMethod 
	  void method1() { int a=1; }
	  // 154. LocalVariableCouldBeFinal
	  void method2() { int b=1; }
	  //101. EmptyMethodInAbstractClassShouldBeAbstract
	  // 232. UncommentedEmptyMethodBody
	  public void couldBeAbstract() {
	    }
	}  

abstract class Foo1 {
	//3. AbstractNaming 
	  void method1() { int a=1; }
	  void method2() { int b=1; }
	}


class Foo2 {
	   // 10. AtLeastOneConstructor
	  public void doSomething() { int a; }
	  // 118. FinalizeDoesNotCallSuperFinalize
	  // 121. FinalizeShouldBeProtected
	  public void finalize() { int a; }
	}

// 24. AvoidFieldNameMatchingMethodName
class Foo3 {
	// 83. DefaultPackage
	Object bar;
	// bar is data or an action or both?
	void bar() {
	}
	// 97. EmptyFinalizer
	protected void finalize() {}
}  

// 34. AvoidProtectedFieldInFinalClass 
// 35. AvoidProtectedMethodInFinalClassNotExtending
final class Bar {
	  private int x;
	  protected int y;
	  Bar() {}
	  protected void baz() {}
	  // 119. FinalizeOnlyCallsSuperFinalize
	  // 268. UselessOverridingMethod
	  protected void finalize() throws Throwable {
			super.finalize();
		}   
	} 

class Beanclass implements Serializable{
	private static final long serialVersionUid = 1L;
	private boolean testBoolean;
	// 50. BeanMembersShouldSerialize
	// 249. UnusedPrivateField
	private int testInt;
	public boolean isTestBoolean() {
		return testBoolean;
	}
	public void setTestBoolean(boolean testBoolean) {
		this.testBoolean = testBoolean;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	public static long getSerialversionuid() {
		return serialVersionUid;
	}
	private String testString;
	// 231. UncommentedEmptyConstructor
	// 236. UnnecessaryConstructor
	public Beanclass(){}
}

// 25. AvoidFieldNameMatchingTypeName
class Foo4{
	int foo4;	
	// 120.FinalizeOverloaded
	protected void finalize(int a) throws Throwable {
		super.finalize();
	}
} 

// 57. CallSuperInConstructor
class Foo5 extends trial{
	public Foo5(){
		// 246. UnusedLocalVariable
		int a = 1;
		// 102. EmptyStatementBlock
		{}
		// 103. EmptyStatementNotInLoop
		;
	}
}
 
final class Foo20 {
	// 239. UnnecessaryFullyQualifiedName
	private java.util.List list1;
    // 238. UnnecessaryFinalModifier
    private final void foo() {
    }
}   
class Foo17 extends trial{
	// 174. NcssConstructorCount
	// 175. NcssMethodCount
	// 176. NcssTypeCount
	public Foo17(){
		super();
		super.bar();
	}
}
// 60. CheckSkipResult
class Foo6 {
	public Foo6()throws FileNotFoundException{
		_s = new FileInputStream("file");
	}
	// 132. ImmutableField
	 private FileInputStream _s; 

	   public void skip(int n) throws IOException {
	      _s.skip(n); // You are not sure that exactly n bytes are skipped
	   }
}

// 64. CloneMethodMustBePublic 
// 66. CloneMethodReturnTypeMustMatchClassName
// 67. CloneThrowsCloneNotSupportedException
class Foo8 implements Cloneable {
    @Override
    protected Object clone() { 
    	Object o = new Object();
    	return o;
    }
}

// 65. CloneMethodMustImplementCloneable
class MyClass {
	 public Object clone() throws CloneNotSupportedException {
		 Object foo = new Object();
		 return foo;
	 }
	} 

//79. ConstructorCallsOverridableMethod
class Myclass1{
	public Myclass1(){
		toString();
	}
}

// 86. DoNotExtendJavaLangError
class Foo9 extends Error { } 

// 89. DoNotUseThreads
class UsingThread extends Thread {
	int air(){
		// 90. DontCallThreadRun
		Thread t = new Thread();
		t.run();    
		try {
	         int y=2;
	        }  catch (RuntimeException se) {
	           throw new RuntimeException(se);
	        }
	     	finally{
	     		// 88. DoNotThrowExceptionInFinally
	     		throw new RuntimeException();
	     	}
		
	}
}

// 94. DoubleCheckedLocking
class Foo10 {
	Object baz = null; 
	Object bar() {
		if (baz == null) { 
			synchronized(this) {
				if (baz == null) {
					baz = new Object();
        		}
      		}
    	}
		return baz;
	}
}  

// 100. EmptyInitializer
class Foo11 {
		// 104. EmptyStaticInitializer
	   static {} 
	   {}
	}   

// 124. GenericsNaming
interface GenericDao<EF extends Foo8, K extends Serializable> {
   // no content
}  

// 138. IntegerInstantiation
class Foo12 {
	private Integer i = new Integer(0); // change to Integer i = Integer.valueOf(0);
}   

// 152.	LocalHomeNamingConvention
// 177. NoPackage
interface MissingProperSuffix extends javax.Ejb.EJBLocalHome {}

// 153. LocalInterfaceSessionNamingConvention
interface MissingProperSuffix1 extends EJBLocalObject {}	

// 161. MDBAndSessionBeanNamingConvention
class MissingTheProperSuffix implements SessionBean {}


class SecureSystem {
	  Foo11 [] ud;
	// 164. MethodReturnsInternalArray
	  public Foo11 [] getUserData() {
	      return ud;
	  }
	  // 165. MethodWithSameNameAsEnclosingClass
	  public void SecureSystem(){}
	}   
	
// 167. MisplacedNullCheck
class Foo14 {
	void bar() {
		String a = null;
		if (a.equals("sure") && a != null) {}
		}
}   

// 169. MissingSerialVersionUID
class Foo15 implements java.io.Serializable {
	 String name;
	} 
// 170. MissingStaticMethodInNonInstantiatableClass
class Foo16 {
	  private Foo16() {}
	  void foo() {}
	}

class Foo19 extends ArrayList{
	public List getFoos(){
		Foo19 l = new Foo19();
		return l;
	}
}
class MyClass3 {
	 // 179. NonStaticInitializer
	  {
	   System.out.println("I am about to construct myself");
	  }
	}  
// 180. NonThreadSafeSingleton
class Foo18{
	// 193. RedundantFieldInitializer
private static Foo14 foo = null;

public static Foo14 getFoo() {
	// 183. OnlyOneReturn
  if (foo==null) {
      foo = new Foo14();
      return foo;
  }
  return foo;
}  
// 185. OverrideBothEqualsAndHashcode
public boolean equals(Object o) {
    return true;
	}
}
// 191. ProperCloneImplementation
class Foo30{
    public Object clone(){
        return new Foo20(); 
    }
} 
// 194. RemoteInterfaceNamingConvention
interface BadSuffixSession extends EJBObject {}
// 195. RemoteSessionInterfaceNamingConvention
interface Missing1ProperSuffix extends EJBHome {}

// 196. ReplaceEnumerationWithIterator
class Foo21 implements Enumeration{
public boolean hasMoreElements() {
		return false;
	}
	public Object nextElement() {
		return null;
	}
}

class Foo22 {
	// 197. ReplaceHashtableWithMap	
	void bar() {
		Hashtable h = new Hashtable();
	}
	// 198. ReplaceVectorWithList
	void bar1() {
	    Vector v = new Vector();
	}   
	// 199. ReturnEmptyArrayRatherThanNull
	public int[] badBehavior() {
    	 return null;
	 }
	
	// 240. UnnecessaryLocalBeforeReturn
	public int[] someMethod(){
		int x[] = badBehavior();
		return x;
	}
	
	// 241. UnnecessaryParentheses
	public boolean someother(){
		return (true);
	}
	// 242.	UnnecessaryReturn
	public void some(){
		return;
	}
}

// 201. ShortClassName
class f{
	// 204. ShortVariable
	int s;
	// 206. SimpleDateFormatNeedsLocale
	private SimpleDateFormat sdf = new SimpleDateFormat("pattern");
	// 202. ShortInstantiation
	private Short i = new Short((short) 0);
	// 203. ShortMethodName
	public boolean a(){ return true;}
	// 207. SimplifiedTernary
	 public boolean test() {
		 boolean condition = true;
	        return condition ? true : a(); 
	    }
	 public void testX(){
		 // 208. SimplifyBooleanAssertion
		 // 234. UnnecessaryBooleanAssertion
		 String r = "";
		 assertFalse(!r.isEmpty());
	 }
	 // 209. SimplifyBooleanExpressions
	 private boolean bar = (a() == true);
	 
	 // 210. SimplifyBooleanReturns
	 public boolean b(){
		 boolean x = true;
		 String y = null;
		 Foo14 z = new Foo14();
		 // 211. SimplifyConditional
		 if (y != null && z instanceof Foo14) {}
	 if (bar == x) {	
			return true;
		} else {
			return false;
	    }
	 }
}

class Singleton {

	   private static Singleton singleton = new Singleton( );
	   
	  private Singleton(){ }
	   
	
	// 212. SingleMethodSingleton
	public static Singleton getInstance(Object obj){
		Singleton singleton = (Singleton) obj;
		return singleton;			
	}
	// 213. SingletonClassReturningNewInstance
	public static Singleton getInstance() {
	synchronized(Singleton.class){
		return new Singleton();					
	}
	}

	// 213.	SingularField
	private int x1;  
    public int foo(int y1) {
     x1 = y1 + 5;
     return x1;
	}  
}
class EJBObject1{}
class SomeEJB extends EJBObject1 implements EJBLocalHome {
	// 214. StaticEJBFieldShouldBeFinal
	// 272. VariableNamingConventions
	private static int CountA;	
	private static final int CountB = 2;
}   
// 228. TooManyFields
class Person {	// too many separate fields
	   int birthYear;
	   int birthMonth;
	   int birthDate;
	   float height;
	   float weight;
	}
class Foo31{
	// 243. UnsynchronizedStaticDateFormatter
	 private static final SimpleDateFormat sdf = new SimpleDateFormat();
	    void bar() {
	        sdf.format(null); 
	    }
	    // 244. UnusedFormalParameter
	    private String bar(String howdy) { return "a";}
	    private void someMethod(){
	    	String a = "a";
	    	// 248. UnusedNullCheckInEquals
	    if (a!=null && bar(a).equals(a)) { 
	    	}
	    //273. WhileLoopsMustUseBraces
	    while(a!=null) return;
	    }
}

// 250. UnusedPrivateMethod
class Something {
	private void foo() {} 
}   

class Foo32{
	// 270. UselessQualifiedThis
	 final Foo32 otherFoo = Foo32.this;
	// 251. UseArrayListInsteadOfVector
	Collection c1 = new Vector();
	// 252. UseArraysAsList
	List l= new ArrayList(10);
	public void good()
	{
		// 255. UseCollectionIsEmpty
		List foo = new ArrayList();
		if (foo.size() == 0) {
			// blah
		}
		// 256. UseConcurrentHashMap
		Map map1 = new HashMap(); 
	}
	public boolean good1(){
		// 257. UseEqualsToCompareStrings
		String s = "one";
		 if (s == "one") return true;
		 return false;
	}
	public void good2(){
		String s2 = "hello world";
		  // 258. UseIndexOfChar
		if (s2.indexOf("d")==1) {}
		// 259. UseLocaleWithCaseConversions
		 if (s2.toLowerCase().equals("list")) { }
		 // 260. UseNotifyAllInsteadOfNotify
		 s2.notify();
		 // 262. UseProperClassLoader
		 ClassLoader cl = Bar.class.getClassLoader();
		 // 263. UseStringBufferForStringAppends
		 String a;
		 a = "foo";
		 a += " bar";
		 // 264. UseStringBufferLength
		 StringBuffer sb = new StringBuffer();
		 if (sb.toString().equals("")) {}
		 // 267. UselessOperationOnImmutable
		 BigDecimal bd=new BigDecimal(10);
		 bd.add(new BigDecimal(5));
		 // 271. UselessStringValueOf
		 s2 = "a" + String.valueOf(a);
	}
}
// 265. UseUtilityClass
class MaybeAUtility {
	  public static void foo() {}
	  public static void bar() {}
	}  
// 261. UseObjectForClearerAPI
class MyClass1 {
	  public void connect(String username,
	    String pssd,
	    String databaseName,
	    String databaseAdress)
	    {

	  }
	}   
// 257. UseCorrectExceptionLogging
class Main {
	   private static final Log _LOG = LogFactory.getLog( Main.class );
	   void bar() {
	     try {
	     } catch( Exception e ) {
	      _LOG.error( e ); //Wrong!
	     }
	   }
	}   


// 62. ClassNamingConventions
// 81. CyclomaticComplexity
// 110. ExcessiveClassLength
// 114. ExcessivePublicCount
// 115. ExtendsObject
// 125. GodClass
// 171.	ModifiedCyclomaticComplexity
// 173. NPathComplexity
// 229. TooManyMethods 
public class trial extends Object{
	public int length;
	public int breadth;
	trial(){ length = 40; breadth =50;}
	
	// 44. AvoidUsingHardCodedIP
	public String ip = "127.0.0.1";
	
	public String [] x;
	// 266. UseVarargs
    public void foo (String [] param) {
      // 7. ArrayIsStoredDirectly
      this.x=param;
    }
   
    public static int getX()
    {
    	return 2; 
    }
    
    // 117. FinalFieldCouldBeStatic
    public final int BAR = 42;
    // 116. FieldDeclarationsShouldBeAtStartOfClass
    public static int x1;
    
    // 172. MoreThanOneLogger
    // 192. ProperLogger
    private static final Log __log = LogFactory.getLog(Foo10.class);
    
    public void FinalFields(int y) {
     x1 = y; // 9. AssignmentToNonFinalStatic
    }

    public void buz(String a){}
    
    // 22. AvoidDuplicateLiterals
    public void baz(){
    	buz("buzz");
    	buz("buzz");
    	buz("buzz");
    	buz("buzz");
    }
    
    // 32. AvoidPrefixingMethodParameters
    public void biz(int inLetter, int outLetter){}
    
    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
    	// 11. AvoidAccessibilityAlteration
        Class[] arrayOfClass = new Class[1];
        this.getClass().getDeclaredConstructors();
        this.getClass().getDeclaredConstructor(arrayOfClass);  
      }
     
    // 42. AvoidThrowingNullPointerException
    public void pointnullex()
    {
    	    throw new NullPointerException();
    }
    
    // 43. AvoidThrowingRawExceptionTypes
    // 205. SignatureDeclareThrowsException
    public void pointex() throws Exception
    {
    	    throw new Exception();
    }
    
    // 36. AvoidReassigningParameters
    private void foo(String bar) {
        bar = "something else";
      }
    
    // 37. AvoidRethrowingException
    public void bar() {
        try {
          int a;
        }  catch (RuntimeException se) {
           throw se;
        }// 98. EmptyFinallyBlock
        finally{}
        
        try {
        	int a;
        }
        catch(Exception e){}
        //  200. ReturnFromFinallyBlock
        finally{ return; }
    } 
    
    //39. AvoidSynchronizedAtMethodLevel
    static synchronized void fooStatic() {
    }
    
    // 38. AvoidStringBufferField
    private StringBuffer buff;
    
    // 45. AvoidUsingNativeCode
    // 164.MethodNamingConventions
    public void SomeJNIClass() {
        System.loadLibrary("nativelib");
    }
 // 48. AvoidUsingVolatile
    volatile String var1;
   
    // 52. BooleanGetMethodName
    public boolean getGoo(){
    	return false;
    }
    
    public String gettingString(){
    	String string = "a";
    	// 54. BrokenNullCheck
    	if (string!=null || !string.equals(""))
    		string = "b";
    	return string;
    }
    
    // 75. ConfusingTernary
    boolean bar(int x, int y) {
    	return (x != y) ? true : false;
    }   
    
    // 105. EmptySynchronizedBlock
    public void sync(){
    synchronized (this) {}
    }
    
    // 109. ExceptionAsFlowControl
    public void bar2() {
        try {
          try {
          } catch (Exception e) {
            throw new RuntimeException(e);
           // this is essentially a GOTO to the WrapperException catch block
           }
         } catch (RuntimeException e) {
         // do some more stuff
        }
      }   
    
    //134. InefficientEmptyStringCheck
    public void bar3(String string) {
    	if (string != null && string.trim().length() > 0) {
    		// 181. NullAssignment
    		string = null;
    	}
    }   

    // 113. ExcessiveParameterList
    public void addPerson(		// too many arguments liable to be mixed up
    		// 162. MethodArgumentCouldBeFinal
    		int birthYear, int birthMonth, int birthDate, int height, int weight, int ssn,
    		int birthYear1, int birthMonth1, int birthDate1, int height1, int weight1, int ssn1) {
    	}
    
    // 155. LoggerIsNotStaticFinal
    Logger logg = Logger.getLogger(Foo.class.getName());
    
    // 159. LooseCoupling
    private ArrayList list = new ArrayList();
    public HashSet getFoo() {
    	return new HashSet();
    }
     // 219. SuspiciousConstantFieldName
    private double PI = 3.16;
    // 220. SuspiciousEqualsMethodName
    public boolean equals(String s) {
        return true;
      }
    // 221. SuspiciousHashcodeMethodName
    public int hashcode(){ return 1;}
    
    public void bar(int x) {
    // 223. SwitchDensity
    	switch (x) {
          case 1: {
        	  int a;
        	  a = 6;
        	  a = a+1;
        	  int b;
        	  b = 7;
        	  b = b+2;
        	  a = a+b;
        	  b = b+2;
        	  a = a+b;
        	  int d = 3;
        	  d = a+b+d;
        	  a = d/2;
            break;
          } case 2: {
        	  int a;
        	  a = 6;
        	  a = a+1;
        	  int b;
        	  b = 7;
        	  b = b+2;
        	  a = a+b;
        	  b = b+2;
        	  a = a+b;
        	  int d = 3;
        	  d = a+b+d;
        	  a = d/2;
            break;
          }
        }
      }
    // 112. ExcessiveMethodLength
    // 215. StdCyclomaticComplexity
    public static void main(String args[]) throws Exception{
    	// 189. PrematureDeclaration
		String s = "" + 123; // 5. AddEmptyString
		
		StringBuffer sb = new StringBuffer();
		sb.append("a"); // 6. AppendCharacterWithChar
		
		 int xx;
		 // 8. AssignmentInOperand
		 if ((xx = getX()) == 3) {
			 System.out.println("3!");
		 }
		
		 int[] a = new int[10];
		 int[] b = new int[10];
		 int[] c = new int[10];
		 for (int i=0;i<10;i++) {
			 c[i]=a[i];
		 }
		 
		 // 12. AvoidArrayLoops
		 for (int i=0;i<10;i++) {
			 // 82. DataflowAnomalyAnalysis
			 b[i]=a[c[i]];
		 }
		 
		 // 14. AvoidBranchingStatementAsLastInLoop
		 for (int i = 0; i < 10; i++) {
			 if (i*i <= 25) {
				 continue;
		    }
		    break;
		 }
		 
		 // 15. AvoidCallingFinalize
		 Foo2 b2 = new Foo2();
	     b2.finalize();
	     
	     // 16. AvoidCatchingGenericException
	     try {
	    	 int i= 0;
	         System.out.println(" i [" + i + "]");
	       } catch(RuntimeException e) {
	    	      e.printStackTrace();
	       }// 96. EmptyCatchBlock
	        catch(Exception e){
	        }
	     
	     // 17. AvoidCatchingNPE
	     try {
	    	 // 225. SystemPrintln
	           System.out.println("a");
	         }  catch (NullPointerException npe) {
	        	 System.out.println("a"); 
	       }
	     
	     
	     // 18. AvoidCatchingThrowable
	     try {
	    	 System.out.println("a");
	        } catch (Throwable th) {  
	    		th.printStackTrace();
	        }
	     
	     // 20. AvoidDecimalLiteralsInBigDecimalConstructor
	     BigDecimal bd = new BigDecimal(1.123);
	
	     // 21. AvoidDeeplyNestedIfStmts
	     // 69. CollapsibleIfStatements
	     int x =1, y=1, z=0;
	     if (x>y) {
	         if (y>z) {
	           if (z==x) {
	        	   z=x+1;
	           }
	         }
	       }
	
	     // 22. AvoidDollarSigns
	     // 
	     int x$;
	     
	     // 26. AvoidFinalLocalVariable
	     // 158. LongVariable
	     final String finalLocalVariable;
	     
	     
	     // 27. AvoidInstanceofChecksInCatchClause
	     try { 
	    	 z=9;
	     } catch (Exception ee) {
	    	 if (ee instanceof IOException) {
	    	   z=8;
	    	 }
	     }
	     
	     // 28. AvoidInstantiatingObjectsInLoops
	     for (int i = 0; i < 10; i++) {
			    Foo4 f = new Foo4(); 
			}
	
	     // 29. AvoidLiteralsInIfCondition
	     if (z == 10) {                        
	         z =20;
	       }
	     
	     // 30. AvoidLosingExceptionInformation
	     try {
	 		z=3;
	 	} catch (Exception se) {
	 		se.getMessage();
	 	}
	     
	    // 31. AvoidMultipleUnaryOperators
	     boolean b3 = !!true;
	     
	    // 33. AvoidPrintStackTrace
	    try {
	         x =2;
	    } catch (Exception e) {
	         e.printStackTrace();
	    }
	    
	     // 40. AvoidThreadGroup
	     ThreadGroup tg = new ThreadGroup("My threadgroup") ;
		 tg = new ThreadGroup(tg, "my thread group");
		 tg = Thread.currentThread().getThreadGroup();
	     
		// 41. AvoidThrowingNewInstanceOfSameException
	     try {
	         y=2;
	        }  catch (RuntimeException se) {
	           throw new RuntimeException(se);
	        }
	     	
	     
	     // 46.	AvoidUsingOctalValues
	     int i2 = 012;	
	     
	     // 47. AvoidUsingShortType
	     short doNotUseShort = 0;
	     
	     // 49. BadComparison
	     // 269. UselessParentheses
	     boolean x1 = (y == Double.NaN); 
	     
	     // 51. BigIntegerInstantiation
	     BigInteger bi2 = new BigInteger("0");
	     
	     // 53. BooleanInstantiation
	     Boolean bar = new Boolean("true");
	     
	     // 55. ByteInstantiation
	     Byte i3 = new Byte((byte) 0);
	     
	     // 59. CheckResultSet 
	     // 68. CloseResource
	     Connection conn = null;
	     conn = DriverManager.getConnection("DB_URL","USER","PASS");
	     Statement stat = conn.createStatement();
	     ResultSet rst = stat.executeQuery("SELECT name FROM person");
	     rst.next(); 	// what if it returns false? bad form
	     String firstName = rst.getString(1);
	     
	     // 61. ClassCastExceptionWithToArray
	     Collection c1 = new ArrayList();
	     Integer[] a1 = (Integer [])c1.toArray();
	     
	     
	     // 182. OneDeclarationPerLine
	     String a4, b4;
	     a4 = "";
	     b4 = "";
	  // 74. CompareObjectsWithEquals
	     if(a4==b4)
	     {
	    	 a4 = "a";
	     }
	     
	     // 76. ConsecutiveAppendsShouldReuse
	     String fo = " ";
	     StringBuffer buf = new StringBuffer();
	     buf.append("Hello"); // poor
	     buf.append(fo);
	     buf.append("World");
	     
	     // 77. ConsecutiveLiteralAppends

	     buf.append("Hello").append(" ").append("World"); // poor
	     
	     // 83. DefaultLabelNotLastInSwitchStmt
	     switch(z) {
	     case 1:  // do something
	        break;
	     default:  // the default case should be last, by convention
	        break;
	     case 2:
	        break;
	    }
	     
	     // 84. DoNotCallGarbageCollectionExplicitly
	     System.gc();
	     
	     // 85. DoNotCallSystemExit
	     System.exit(0);
	     
	     // 87. DoNotHardCodeSDCard
	     String storageLocation = "/sdcard/mypackage";
	     
	     // 93. DontUseFloatTypeForLoopIndices
	     int count = 0;
	     for (float f = 10; f < 50; f++)
	       count++;
	     
	     // 99. EmptyIfStmt
	     if(z==6)
	     {
	     }
	     
	     // 104. EmptySwitchStatements
	     // 224. SwitchStmtsShouldHaveDefault
	     // 227. TooFewBranchesForASwitchStatement
	     switch(z)
	     {}
	     
	     // 106. EmptyTryBlock
	     try{}
	     catch(Exception e){ z = 4;}
	     
	     // 107. EmptyWhileStmt
	     while(z==3){}
	     
	     // 108. EqualsNull
	     String x2="foo";
	     if (x2.equals(null)) { // bad form
	    	   	x = 4;
	    		}
	     
	     // 123. ForLoopsMustUseBraces
	     for (int i = 0; i < 42; i++)
	    	   z=2;  
	     
	     // 126. GuardDebugLogging
	     // 127. GuardLogStatement
	     __log.debug("log something" + " and " + "concat strings");
	     // 128. GuardLogStatementJavaUtil
	     Logger log = Logger.getLogger(null); 
	     // 151. LawOfDemeter
	     log.fine("log something" + " and " + "concat strings");   
	     // 139. InvalidSlf4jMessageFormat
	     __log.error("error");
	     // 129. IdempotentOperations
	     x=x;
	     //130. IfElseStmtsMustUseBraces
	     if (z==3)
	         x = x+1;
	     else
	         x = x-1;
	     
	     // 122. ForLoopShouldBeWhileLoop
	     boolean s1;
	     for (;true;) break;
	     
	     //131. IfStmtsMustUseBraces
	     if(z==3)
	    	 x=x+1;
	 
	     // 135. InefficientStringBuffering
	     StringBuffer sb1 = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
	     
	     // 136. InstantiationToGetClass
	     Class c2 = new String().getClass();
	     
	     // 137. InsufficientStringBufferDeclaration
	     StringBuffer bad = new StringBuffer();
	     bad.append("This is a long string that will exceed the default 16 characters");
	     
	     // 150. JumbledIncrementer
	     for (int i = 0; i < 10; i++) {			// only references 'i'
				for (int k = 0; k < 20; i++) {		// references both 'i' and 'k'
					System.out.println("Hello");
				}
			}
	     
	     // 156. LogicInversion
	     if (!(x == y)) { 
	         z = 2;
	     }
	     
	     // 157. LongInstantiation
	     Long i4 = new Long(0);
	     
	     // 166. MisleadingVariableName 
	     int m_boz = 42;
	     
	     // 168. MissingBreakInSwitch
	     switch(z)
	     {
	     	case 1: 
	     		x=5;
	     	case 2:
	     		x=6;
	     	default:
	     		break;
	     }
	     // 184. OptimizableToArrayCall
	     List foos= new Foo19();
	     Foo19[] fooArray = (Foo19[]) foos.toArray(new Foo19[0]);
	     // 187. PositionLiteralsFirstInCaseInsensitiveComparisons 
	     // 188. PositionLiteralsFirstInComparisons
	     s.equalsIgnoreCase("2");
	     
	     try{ x=4;}
	     catch(Exception e){
	    	 // 190. PreserveStackTrace
	    	 throw new Exception(e.getMessage());
	     }
	     
	     // 216. StringBufferInstantiationWithChar
	     StringBuilder str = new StringBuilder('C');
	     //217. StringInstantiation 
	     String bar2 = new String("bar");
	     // 218. StringToString
	     String bar3 = "howdy";
	     String bar4 =bar.toString();
	     // 222. SuspiciousOctalEscape
	     System.out.println("suspicious: \128");
	     // 233. UnconditionalIfStatement
	     if(true){}
	     // 235. UnnecessaryCaseChange
	     String buz = "abc";
	     boolean answer1 = buz.toUpperCase().equals("baz");
	     
	     // 237. UnnecessaryConversionTemporary
	     String foost = new Integer(x).toString();
	     // 243. UnnecessaryWrapperObjectCreation
	     int i1 = Integer.valueOf(s).intValue();
	     
	}
	} 
	