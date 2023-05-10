// Generated from F:\github\myfork\osc2checker\osc2grammar/OpenSCENARIO2.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpenSCENARIO2Parser}.
 */
public interface OpenSCENARIO2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#osc}.
	 * @param ctx the parse tree
	 */
	void enterOsc(OpenSCENARIO2Parser.OscContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#osc}.
	 * @param ctx the parse tree
	 */
	void exitOsc(OpenSCENARIO2Parser.OscContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#preludeStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreludeStatement(OpenSCENARIO2Parser.PreludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#preludeStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreludeStatement(OpenSCENARIO2Parser.PreludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(OpenSCENARIO2Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(OpenSCENARIO2Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#importReference}.
	 * @param ctx the parse tree
	 */
	void enterImportReference(OpenSCENARIO2Parser.ImportReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#importReference}.
	 * @param ctx the parse tree
	 */
	void exitImportReference(OpenSCENARIO2Parser.ImportReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#structuredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterStructuredIdentifier(OpenSCENARIO2Parser.StructuredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#structuredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitStructuredIdentifier(OpenSCENARIO2Parser.StructuredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#oscDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOscDeclaration(OpenSCENARIO2Parser.OscDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#oscDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOscDeclaration(OpenSCENARIO2Parser.OscDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#physicalTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalTypeDeclaration(OpenSCENARIO2Parser.PhysicalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#physicalTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalTypeDeclaration(OpenSCENARIO2Parser.PhysicalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#physicalTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalTypeName(OpenSCENARIO2Parser.PhysicalTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#physicalTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalTypeName(OpenSCENARIO2Parser.PhysicalTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#baseUnitSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseUnitSpecifier(OpenSCENARIO2Parser.BaseUnitSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#baseUnitSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseUnitSpecifier(OpenSCENARIO2Parser.BaseUnitSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sIBaseUnitSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSIBaseUnitSpecifier(OpenSCENARIO2Parser.SIBaseUnitSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sIBaseUnitSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSIBaseUnitSpecifier(OpenSCENARIO2Parser.SIBaseUnitSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#unitDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUnitDeclaration(OpenSCENARIO2Parser.UnitDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#unitDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUnitDeclaration(OpenSCENARIO2Parser.UnitDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#unitSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterUnitSpecifier(OpenSCENARIO2Parser.UnitSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#unitSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitUnitSpecifier(OpenSCENARIO2Parser.UnitSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sIUnitSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSIUnitSpecifier(OpenSCENARIO2Parser.SIUnitSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sIUnitSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSIUnitSpecifier(OpenSCENARIO2Parser.SIUnitSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sIBaseExponentList}.
	 * @param ctx the parse tree
	 */
	void enterSIBaseExponentList(OpenSCENARIO2Parser.SIBaseExponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sIBaseExponentList}.
	 * @param ctx the parse tree
	 */
	void exitSIBaseExponentList(OpenSCENARIO2Parser.SIBaseExponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sIBaseExponent}.
	 * @param ctx the parse tree
	 */
	void enterSIBaseExponent(OpenSCENARIO2Parser.SIBaseExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sIBaseExponent}.
	 * @param ctx the parse tree
	 */
	void exitSIBaseExponent(OpenSCENARIO2Parser.SIBaseExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sIFactor}.
	 * @param ctx the parse tree
	 */
	void enterSIFactor(OpenSCENARIO2Parser.SIFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sIFactor}.
	 * @param ctx the parse tree
	 */
	void exitSIFactor(OpenSCENARIO2Parser.SIFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sIOffset}.
	 * @param ctx the parse tree
	 */
	void enterSIOffset(OpenSCENARIO2Parser.SIOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sIOffset}.
	 * @param ctx the parse tree
	 */
	void exitSIOffset(OpenSCENARIO2Parser.SIOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(OpenSCENARIO2Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(OpenSCENARIO2Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#enumMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberDecl(OpenSCENARIO2Parser.EnumMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#enumMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberDecl(OpenSCENARIO2Parser.EnumMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#numMemberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumMemberValue(OpenSCENARIO2Parser.NumMemberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#numMemberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumMemberValue(OpenSCENARIO2Parser.NumMemberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(OpenSCENARIO2Parser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(OpenSCENARIO2Parser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#enumMemberName}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberName(OpenSCENARIO2Parser.EnumMemberNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#enumMemberName}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberName(OpenSCENARIO2Parser.EnumMemberNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#enumValueReference}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueReference(OpenSCENARIO2Parser.EnumValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#enumValueReference}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueReference(OpenSCENARIO2Parser.EnumValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(OpenSCENARIO2Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(OpenSCENARIO2Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#structMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructMemberDecl(OpenSCENARIO2Parser.StructMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#structMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructMemberDecl(OpenSCENARIO2Parser.StructMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(OpenSCENARIO2Parser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(OpenSCENARIO2Parser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(OpenSCENARIO2Parser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(OpenSCENARIO2Parser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#actorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterActorDeclaration(OpenSCENARIO2Parser.ActorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#actorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitActorDeclaration(OpenSCENARIO2Parser.ActorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#actorMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterActorMemberDecl(OpenSCENARIO2Parser.ActorMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#actorMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitActorMemberDecl(OpenSCENARIO2Parser.ActorMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#actorName}.
	 * @param ctx the parse tree
	 */
	void enterActorName(OpenSCENARIO2Parser.ActorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#actorName}.
	 * @param ctx the parse tree
	 */
	void exitActorName(OpenSCENARIO2Parser.ActorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#scenarioDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterScenarioDeclaration(OpenSCENARIO2Parser.ScenarioDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#scenarioDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitScenarioDeclaration(OpenSCENARIO2Parser.ScenarioDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#scenarioMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterScenarioMemberDecl(OpenSCENARIO2Parser.ScenarioMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#scenarioMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitScenarioMemberDecl(OpenSCENARIO2Parser.ScenarioMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#qualifiedBehaviorName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedBehaviorName(OpenSCENARIO2Parser.QualifiedBehaviorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#qualifiedBehaviorName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedBehaviorName(OpenSCENARIO2Parser.QualifiedBehaviorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#behaviorName}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorName(OpenSCENARIO2Parser.BehaviorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#behaviorName}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorName(OpenSCENARIO2Parser.BehaviorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#actionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterActionDeclaration(OpenSCENARIO2Parser.ActionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#actionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitActionDeclaration(OpenSCENARIO2Parser.ActionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#modifierDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModifierDeclaration(OpenSCENARIO2Parser.ModifierDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#modifierDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModifierDeclaration(OpenSCENARIO2Parser.ModifierDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#modifierName}.
	 * @param ctx the parse tree
	 */
	void enterModifierName(OpenSCENARIO2Parser.ModifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#modifierName}.
	 * @param ctx the parse tree
	 */
	void exitModifierName(OpenSCENARIO2Parser.ModifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#typeExtension}.
	 * @param ctx the parse tree
	 */
	void enterTypeExtension(OpenSCENARIO2Parser.TypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#typeExtension}.
	 * @param ctx the parse tree
	 */
	void exitTypeExtension(OpenSCENARIO2Parser.TypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#enumTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeExtension(OpenSCENARIO2Parser.EnumTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#enumTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeExtension(OpenSCENARIO2Parser.EnumTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#structuredTypeExtension}.
	 * @param ctx the parse tree
	 */
	void enterStructuredTypeExtension(OpenSCENARIO2Parser.StructuredTypeExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#structuredTypeExtension}.
	 * @param ctx the parse tree
	 */
	void exitStructuredTypeExtension(OpenSCENARIO2Parser.StructuredTypeExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#extendableTypeName}.
	 * @param ctx the parse tree
	 */
	void enterExtendableTypeName(OpenSCENARIO2Parser.ExtendableTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#extendableTypeName}.
	 * @param ctx the parse tree
	 */
	void exitExtendableTypeName(OpenSCENARIO2Parser.ExtendableTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#extensionMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterExtensionMemberDecl(OpenSCENARIO2Parser.ExtensionMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#extensionMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitExtensionMemberDecl(OpenSCENARIO2Parser.ExtensionMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#globalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalParameterDeclaration(OpenSCENARIO2Parser.GlobalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#globalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalParameterDeclaration(OpenSCENARIO2Parser.GlobalParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarator(OpenSCENARIO2Parser.TypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#typeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarator(OpenSCENARIO2Parser.TypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#nonAggregateTypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateTypeDeclarator(OpenSCENARIO2Parser.NonAggregateTypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#nonAggregateTypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateTypeDeclarator(OpenSCENARIO2Parser.NonAggregateTypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#aggregateTypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAggregateTypeDeclarator(OpenSCENARIO2Parser.AggregateTypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#aggregateTypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAggregateTypeDeclarator(OpenSCENARIO2Parser.AggregateTypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#listTypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterListTypeDeclarator(OpenSCENARIO2Parser.ListTypeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#listTypeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitListTypeDeclarator(OpenSCENARIO2Parser.ListTypeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(OpenSCENARIO2Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(OpenSCENARIO2Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(OpenSCENARIO2Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(OpenSCENARIO2Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEventDeclaration(OpenSCENARIO2Parser.EventDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEventDeclaration(OpenSCENARIO2Parser.EventDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventSpecification}.
	 * @param ctx the parse tree
	 */
	void enterEventSpecification(OpenSCENARIO2Parser.EventSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventSpecification}.
	 * @param ctx the parse tree
	 */
	void exitEventSpecification(OpenSCENARIO2Parser.EventSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventReference}.
	 * @param ctx the parse tree
	 */
	void enterEventReference(OpenSCENARIO2Parser.EventReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventReference}.
	 * @param ctx the parse tree
	 */
	void exitEventReference(OpenSCENARIO2Parser.EventReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterEventFieldDecl(OpenSCENARIO2Parser.EventFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitEventFieldDecl(OpenSCENARIO2Parser.EventFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventFieldName}.
	 * @param ctx the parse tree
	 */
	void enterEventFieldName(OpenSCENARIO2Parser.EventFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventFieldName}.
	 * @param ctx the parse tree
	 */
	void exitEventFieldName(OpenSCENARIO2Parser.EventFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(OpenSCENARIO2Parser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(OpenSCENARIO2Parser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventPath}.
	 * @param ctx the parse tree
	 */
	void enterEventPath(OpenSCENARIO2Parser.EventPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventPath}.
	 * @param ctx the parse tree
	 */
	void exitEventPath(OpenSCENARIO2Parser.EventPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void enterEventCondition(OpenSCENARIO2Parser.EventConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#eventCondition}.
	 * @param ctx the parse tree
	 */
	void exitEventCondition(OpenSCENARIO2Parser.EventConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#riseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRiseExpression(OpenSCENARIO2Parser.RiseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#riseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRiseExpression(OpenSCENARIO2Parser.RiseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#fallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFallExpression(OpenSCENARIO2Parser.FallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#fallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFallExpression(OpenSCENARIO2Parser.FallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#elapsedExpression}.
	 * @param ctx the parse tree
	 */
	void enterElapsedExpression(OpenSCENARIO2Parser.ElapsedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#elapsedExpression}.
	 * @param ctx the parse tree
	 */
	void exitElapsedExpression(OpenSCENARIO2Parser.ElapsedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#everyExpression}.
	 * @param ctx the parse tree
	 */
	void enterEveryExpression(OpenSCENARIO2Parser.EveryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#everyExpression}.
	 * @param ctx the parse tree
	 */
	void exitEveryExpression(OpenSCENARIO2Parser.EveryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(OpenSCENARIO2Parser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(OpenSCENARIO2Parser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#durationExpression}.
	 * @param ctx the parse tree
	 */
	void enterDurationExpression(OpenSCENARIO2Parser.DurationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#durationExpression}.
	 * @param ctx the parse tree
	 */
	void exitDurationExpression(OpenSCENARIO2Parser.DurationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(OpenSCENARIO2Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(OpenSCENARIO2Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(OpenSCENARIO2Parser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(OpenSCENARIO2Parser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(OpenSCENARIO2Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(OpenSCENARIO2Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sampleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSampleExpression(OpenSCENARIO2Parser.SampleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sampleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSampleExpression(OpenSCENARIO2Parser.SampleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(OpenSCENARIO2Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(OpenSCENARIO2Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#parameterWithDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithDeclaration(OpenSCENARIO2Parser.ParameterWithDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#parameterWithDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithDeclaration(OpenSCENARIO2Parser.ParameterWithDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#parameterWithMember}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithMember(OpenSCENARIO2Parser.ParameterWithMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#parameterWithMember}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithMember(OpenSCENARIO2Parser.ParameterWithMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#constraintDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(OpenSCENARIO2Parser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#constraintDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(OpenSCENARIO2Parser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#keepConstraintDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKeepConstraintDeclaration(OpenSCENARIO2Parser.KeepConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#keepConstraintDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKeepConstraintDeclaration(OpenSCENARIO2Parser.KeepConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#constraintQualifier}.
	 * @param ctx the parse tree
	 */
	void enterConstraintQualifier(OpenSCENARIO2Parser.ConstraintQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#constraintQualifier}.
	 * @param ctx the parse tree
	 */
	void exitConstraintQualifier(OpenSCENARIO2Parser.ConstraintQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#constraintExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstraintExpression(OpenSCENARIO2Parser.ConstraintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#constraintExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstraintExpression(OpenSCENARIO2Parser.ConstraintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#removeDefaultDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRemoveDefaultDeclaration(OpenSCENARIO2Parser.RemoveDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#removeDefaultDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRemoveDefaultDeclaration(OpenSCENARIO2Parser.RemoveDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#parameterReference}.
	 * @param ctx the parse tree
	 */
	void enterParameterReference(OpenSCENARIO2Parser.ParameterReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#parameterReference}.
	 * @param ctx the parse tree
	 */
	void exitParameterReference(OpenSCENARIO2Parser.ParameterReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#behaviorExpression}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorExpression(OpenSCENARIO2Parser.BehaviorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#behaviorExpression}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorExpression(OpenSCENARIO2Parser.BehaviorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#behaviorSpecification}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorSpecification(OpenSCENARIO2Parser.BehaviorSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#behaviorSpecification}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorSpecification(OpenSCENARIO2Parser.BehaviorSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#onDirective}.
	 * @param ctx the parse tree
	 */
	void enterOnDirective(OpenSCENARIO2Parser.OnDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#onDirective}.
	 * @param ctx the parse tree
	 */
	void exitOnDirective(OpenSCENARIO2Parser.OnDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#onMember}.
	 * @param ctx the parse tree
	 */
	void enterOnMember(OpenSCENARIO2Parser.OnMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#onMember}.
	 * @param ctx the parse tree
	 */
	void exitOnMember(OpenSCENARIO2Parser.OnMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#doDirective}.
	 * @param ctx the parse tree
	 */
	void enterDoDirective(OpenSCENARIO2Parser.DoDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#doDirective}.
	 * @param ctx the parse tree
	 */
	void exitDoDirective(OpenSCENARIO2Parser.DoDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#doMember}.
	 * @param ctx the parse tree
	 */
	void enterDoMember(OpenSCENARIO2Parser.DoMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#doMember}.
	 * @param ctx the parse tree
	 */
	void exitDoMember(OpenSCENARIO2Parser.DoMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#composition}.
	 * @param ctx the parse tree
	 */
	void enterComposition(OpenSCENARIO2Parser.CompositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#composition}.
	 * @param ctx the parse tree
	 */
	void exitComposition(OpenSCENARIO2Parser.CompositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#compositionOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompositionOperator(OpenSCENARIO2Parser.CompositionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#compositionOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompositionOperator(OpenSCENARIO2Parser.CompositionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#behaviorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorInvocation(OpenSCENARIO2Parser.BehaviorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#behaviorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorInvocation(OpenSCENARIO2Parser.BehaviorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#behaviorWithDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorWithDeclaration(OpenSCENARIO2Parser.BehaviorWithDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#behaviorWithDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorWithDeclaration(OpenSCENARIO2Parser.BehaviorWithDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#behaviorWithMember}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorWithMember(OpenSCENARIO2Parser.BehaviorWithMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#behaviorWithMember}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorWithMember(OpenSCENARIO2Parser.BehaviorWithMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(OpenSCENARIO2Parser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(OpenSCENARIO2Parser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#actorExpression}.
	 * @param ctx the parse tree
	 */
	void enterActorExpression(OpenSCENARIO2Parser.ActorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#actorExpression}.
	 * @param ctx the parse tree
	 */
	void exitActorExpression(OpenSCENARIO2Parser.ActorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#waitDirective}.
	 * @param ctx the parse tree
	 */
	void enterWaitDirective(OpenSCENARIO2Parser.WaitDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#waitDirective}.
	 * @param ctx the parse tree
	 */
	void exitWaitDirective(OpenSCENARIO2Parser.WaitDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#emitDirective}.
	 * @param ctx the parse tree
	 */
	void enterEmitDirective(OpenSCENARIO2Parser.EmitDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#emitDirective}.
	 * @param ctx the parse tree
	 */
	void exitEmitDirective(OpenSCENARIO2Parser.EmitDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#callDirective}.
	 * @param ctx the parse tree
	 */
	void enterCallDirective(OpenSCENARIO2Parser.CallDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#callDirective}.
	 * @param ctx the parse tree
	 */
	void exitCallDirective(OpenSCENARIO2Parser.CallDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#untilDirective}.
	 * @param ctx the parse tree
	 */
	void enterUntilDirective(OpenSCENARIO2Parser.UntilDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#untilDirective}.
	 * @param ctx the parse tree
	 */
	void exitUntilDirective(OpenSCENARIO2Parser.UntilDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(OpenSCENARIO2Parser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(OpenSCENARIO2Parser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(OpenSCENARIO2Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(OpenSCENARIO2Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(OpenSCENARIO2Parser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(OpenSCENARIO2Parser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#methodImplementation}.
	 * @param ctx the parse tree
	 */
	void enterMethodImplementation(OpenSCENARIO2Parser.MethodImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#methodImplementation}.
	 * @param ctx the parse tree
	 */
	void exitMethodImplementation(OpenSCENARIO2Parser.MethodImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#methodQualifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodQualifier(OpenSCENARIO2Parser.MethodQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#methodQualifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodQualifier(OpenSCENARIO2Parser.MethodQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(OpenSCENARIO2Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(OpenSCENARIO2Parser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#coverageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCoverageDeclaration(OpenSCENARIO2Parser.CoverageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#coverageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCoverageDeclaration(OpenSCENARIO2Parser.CoverageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#modifierApplication}.
	 * @param ctx the parse tree
	 */
	void enterModifierApplication(OpenSCENARIO2Parser.ModifierApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#modifierApplication}.
	 * @param ctx the parse tree
	 */
	void exitModifierApplication(OpenSCENARIO2Parser.ModifierApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OpenSCENARIO2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OpenSCENARIO2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#ternaryOpExp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOpExp(OpenSCENARIO2Parser.TernaryOpExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#ternaryOpExp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOpExp(OpenSCENARIO2Parser.TernaryOpExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(OpenSCENARIO2Parser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(OpenSCENARIO2Parser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(OpenSCENARIO2Parser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(OpenSCENARIO2Parser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(OpenSCENARIO2Parser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(OpenSCENARIO2Parser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterInversion(OpenSCENARIO2Parser.InversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitInversion(OpenSCENARIO2Parser.InversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(OpenSCENARIO2Parser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(OpenSCENARIO2Parser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(OpenSCENARIO2Parser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(OpenSCENARIO2Parser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(OpenSCENARIO2Parser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(OpenSCENARIO2Parser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(OpenSCENARIO2Parser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(OpenSCENARIO2Parser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(OpenSCENARIO2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(OpenSCENARIO2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(OpenSCENARIO2Parser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(OpenSCENARIO2Parser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(OpenSCENARIO2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(OpenSCENARIO2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#postfixExp}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExp(OpenSCENARIO2Parser.PostfixExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#postfixExp}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExp(OpenSCENARIO2Parser.PostfixExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(OpenSCENARIO2Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(OpenSCENARIO2Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(OpenSCENARIO2Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(OpenSCENARIO2Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#valueExp}.
	 * @param ctx the parse tree
	 */
	void enterValueExp(OpenSCENARIO2Parser.ValueExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#valueExp}.
	 * @param ctx the parse tree
	 */
	void exitValueExp(OpenSCENARIO2Parser.ValueExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#listConstructor}.
	 * @param ctx the parse tree
	 */
	void enterListConstructor(OpenSCENARIO2Parser.ListConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#listConstructor}.
	 * @param ctx the parse tree
	 */
	void exitListConstructor(OpenSCENARIO2Parser.ListConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#rangeConstructor}.
	 * @param ctx the parse tree
	 */
	void enterRangeConstructor(OpenSCENARIO2Parser.RangeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#rangeConstructor}.
	 * @param ctx the parse tree
	 */
	void exitRangeConstructor(OpenSCENARIO2Parser.RangeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#argumentListSpecification}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListSpecification(OpenSCENARIO2Parser.ArgumentListSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#argumentListSpecification}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListSpecification(OpenSCENARIO2Parser.ArgumentListSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#argumentSpecification}.
	 * @param ctx the parse tree
	 */
	void enterArgumentSpecification(OpenSCENARIO2Parser.ArgumentSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#argumentSpecification}.
	 * @param ctx the parse tree
	 */
	void exitArgumentSpecification(OpenSCENARIO2Parser.ArgumentSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(OpenSCENARIO2Parser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(OpenSCENARIO2Parser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(OpenSCENARIO2Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(OpenSCENARIO2Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#positionalArgument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(OpenSCENARIO2Parser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#positionalArgument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(OpenSCENARIO2Parser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(OpenSCENARIO2Parser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(OpenSCENARIO2Parser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#physicalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalLiteral(OpenSCENARIO2Parser.PhysicalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#physicalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalLiteral(OpenSCENARIO2Parser.PhysicalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpenSCENARIO2Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(OpenSCENARIO2Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenSCENARIO2Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(OpenSCENARIO2Parser.IntegerLiteralContext ctx);
}