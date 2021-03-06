package fr.aoste.ccsl.basic;

public interface ICCSLSpecificationVisitor {
	void visit(BasicCCSLSpecification specification);
	
	void visit(Causality relation);
	void visit(Precedence relation);
	void visit(Exclusion relation);
	void visit(Coincidence relation);
	void visit(Subclock relation);
	void visit(Alternation relation);
	
	void visit(Union expression);	
	void visit(Intersection expression);	
	void visit(Filter expression);	
}
