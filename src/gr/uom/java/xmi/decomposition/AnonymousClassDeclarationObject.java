package gr.uom.java.xmi.decomposition;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;

import gr.uom.java.xmi.LocationInfo;
import gr.uom.java.xmi.LocationInfoProvider;

public class AnonymousClassDeclarationObject implements LocationInfoProvider {
	private LocationInfo locationInfo;
	private AnonymousClassDeclaration astNode;
	private String astNodeString;
	private List<String> variables = new ArrayList<String>();
	private List<String> types = new ArrayList<String>();
	private Map<String, OperationInvocation> methodInvocationMap = new LinkedHashMap<String, OperationInvocation>();
	private List<VariableDeclaration> variableDeclarations = new ArrayList<VariableDeclaration>();
	private List<AnonymousClassDeclarationObject> anonymousClassDeclarations = new ArrayList<AnonymousClassDeclarationObject>();
	private List<String> stringLiterals = new ArrayList<String>();
	private List<String> numberLiterals = new ArrayList<String>();
	private List<String> booleanLiterals = new ArrayList<String>();
	private List<String> typeLiterals = new ArrayList<String>();
	private Map<String, ObjectCreation> creationMap = new LinkedHashMap<String, ObjectCreation>();
	private List<String> infixOperators = new ArrayList<String>();
	private List<String> arguments = new ArrayList<String>();
	private List<TernaryOperatorExpression> ternaryOperatorExpressions = new ArrayList<TernaryOperatorExpression>();
	private List<LambdaExpressionObject> lambdas = new ArrayList<LambdaExpressionObject>();
	
	public AnonymousClassDeclarationObject(CompilationUnit cu, String filePath, AnonymousClassDeclaration anonymous) {
		this.locationInfo = new LocationInfo(cu, filePath, anonymous);
		this.astNode = anonymous;
		this.astNodeString = anonymous.toString();
	}

	public LocationInfo getLocationInfo() {
		return locationInfo;
	}

	public AnonymousClassDeclaration getAstNode() {
		return astNode;
	}

	public void setAstNode(AnonymousClassDeclaration node) {
		this.astNode = node;
	}
	
	public String toString() {
		return astNodeString;
	}

	public Map<String, OperationInvocation> getMethodInvocationMap() {
		return this.methodInvocationMap;
	}

	public List<VariableDeclaration> getVariableDeclarations() {
		return variableDeclarations;
	}

	public List<String> getTypes() {
		return types;
	}

	public List<AnonymousClassDeclarationObject> getAnonymousClassDeclarations() {
		return anonymousClassDeclarations;
	}

	public List<String> getStringLiterals() {
		return stringLiterals;
	}

	public List<String> getNumberLiterals() {
		return numberLiterals;
	}

	public List<String> getBooleanLiterals() {
		return booleanLiterals;
	}

	public List<String> getTypeLiterals() {
		return typeLiterals;
	}

	public Map<String, ObjectCreation> getCreationMap() {
		return creationMap;
	}

	public List<String> getInfixOperators() {
		return infixOperators;
	}

	public List<String> getArguments() {
		return this.arguments;
	}

	public List<TernaryOperatorExpression> getTernaryOperatorExpressions() {
		return ternaryOperatorExpressions;
	}

	public List<String> getVariables() {
		return variables;
	}

	public List<LambdaExpressionObject> getLambdas() {
		return lambdas;
	}
}
