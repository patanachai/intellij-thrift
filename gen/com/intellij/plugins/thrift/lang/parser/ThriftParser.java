// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.parser;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.intellij.plugins.thrift.lang.lexer.ThriftTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ThriftParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("com.intellij.plugins.thrift.lang.parser.ThriftParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == BASE_TYPE) {
      result_ = BaseType(builder_, level_ + 1);
    }
    else if (root_ == CONST) {
      result_ = Const(builder_, level_ + 1);
    }
    else if (root_ == CONST_LIST) {
      result_ = ConstList(builder_, level_ + 1);
    }
    else if (root_ == CONST_MAP) {
      result_ = ConstMap(builder_, level_ + 1);
    }
    else if (root_ == CONST_VALUE) {
      result_ = ConstValue(builder_, level_ + 1);
    }
    else if (root_ == CPP_TYPE) {
      result_ = CppType(builder_, level_ + 1);
    }
    else if (root_ == CUSTOM_TYPE) {
      result_ = CustomType(builder_, level_ + 1);
    }
    else if (root_ == DEFINITION_NAME) {
      result_ = DefinitionName(builder_, level_ + 1);
    }
    else if (root_ == DOUBLE_CONSTANT) {
      result_ = DoubleConstant(builder_, level_ + 1);
    }
    else if (root_ == ENUM) {
      result_ = Enum(builder_, level_ + 1);
    }
    else if (root_ == EXCEPTION) {
      result_ = Exception(builder_, level_ + 1);
    }
    else if (root_ == FIELD) {
      result_ = Field(builder_, level_ + 1);
    }
    else if (root_ == FIELD_ID) {
      result_ = FieldID(builder_, level_ + 1);
    }
    else if (root_ == FIELD_REQ) {
      result_ = FieldReq(builder_, level_ + 1);
    }
    else if (root_ == FIELD_TYPE) {
      result_ = FieldType(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION) {
      result_ = Function(builder_, level_ + 1);
    }
    else if (root_ == FUNCTION_TYPE) {
      result_ = FunctionType(builder_, level_ + 1);
    }
    else if (root_ == INCLUDE) {
      result_ = Include(builder_, level_ + 1);
    }
    else if (root_ == INT_CONSTANT) {
      result_ = IntConstant(builder_, level_ + 1);
    }
    else if (root_ == LIST_SEPARATOR) {
      result_ = ListSeparator(builder_, level_ + 1);
    }
    else if (root_ == LIST_TYPE) {
      result_ = ListType(builder_, level_ + 1);
    }
    else if (root_ == MAP_TYPE) {
      result_ = MapType(builder_, level_ + 1);
    }
    else if (root_ == NAMESPACE) {
      result_ = Namespace(builder_, level_ + 1);
    }
    else if (root_ == NAMESPACE_SCOPE) {
      result_ = NamespaceScope(builder_, level_ + 1);
    }
    else if (root_ == SENUM) {
      result_ = Senum(builder_, level_ + 1);
    }
    else if (root_ == SERVICE) {
      result_ = Service(builder_, level_ + 1);
    }
    else if (root_ == SERVICE_SUPER_NAME) {
      result_ = ServiceSuperName(builder_, level_ + 1);
    }
    else if (root_ == SET_TYPE) {
      result_ = SetType(builder_, level_ + 1);
    }
    else if (root_ == STRUCT) {
      result_ = Struct(builder_, level_ + 1);
    }
    else if (root_ == THROWS) {
      result_ = Throws(builder_, level_ + 1);
    }
    else if (root_ == TYPE_ANNOTATION) {
      result_ = TypeAnnotation(builder_, level_ + 1);
    }
    else if (root_ == TYPE_ANNOTATION_LIST) {
      result_ = TypeAnnotationList(builder_, level_ + 1);
    }
    else if (root_ == TYPE_ANNOTATIONS) {
      result_ = TypeAnnotations(builder_, level_ + 1);
    }
    else if (root_ == TYPEDEF) {
      result_ = Typedef(builder_, level_ + 1);
    }
    else if (root_ == UNION) {
      result_ = Union(builder_, level_ + 1);
    }
    else if (root_ == XSD_ATTRS) {
      result_ = XsdAttrs(builder_, level_ + 1);
    }
    else if (root_ == XSD_FIELD_OPTIONS) {
      result_ = XsdFieldOptions(builder_, level_ + 1);
    }
    else if (root_ == ENUM_FIELD) {
      result_ = enumField(builder_, level_ + 1);
    }
    else if (root_ == ENUM_FIELDS) {
      result_ = enumFields(builder_, level_ + 1);
    }
    else if (root_ == FIELDS) {
      result_ = fields(builder_, level_ + 1);
    }
    else if (root_ == SEMUN_FIELD) {
      result_ = semunField(builder_, level_ + 1);
    }
    else if (root_ == SENUM_BODY) {
      result_ = senumBody(builder_, level_ + 1);
    }
    else if (root_ == SERVICE_BODY) {
      result_ = serviceBody(builder_, level_ + 1);
    }
    else {
      Marker marker_ = builder_.mark();
      enterErrorRecordingSection(builder_, level_, _SECTION_RECOVER_, null);
      result_ = parse_root_(root_, builder_, level_);
      exitErrorRecordingSection(builder_, level_, result_, true, _SECTION_RECOVER_, TOKEN_ADVANCER);
      marker_.done(root_);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return Document(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // 'bool' | 'byte' | 'i16' | 'i32' | 'i64' | 'double' | 'string' | 'binary' | 'slist'
  public static boolean BaseType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BaseType")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<base type>");
    result_ = consumeToken(builder_, "bool");
    if (!result_) result_ = consumeToken(builder_, "byte");
    if (!result_) result_ = consumeToken(builder_, "i16");
    if (!result_) result_ = consumeToken(builder_, "i32");
    if (!result_) result_ = consumeToken(builder_, "i64");
    if (!result_) result_ = consumeToken(builder_, "double");
    if (!result_) result_ = consumeToken(builder_, "string");
    if (!result_) result_ = consumeToken(builder_, "binary");
    if (!result_) result_ = consumeToken(builder_, "slist");
    if (result_) {
      marker_.done(BASE_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // 'const' FieldType DefinitionName '=' ConstValue ListSeparator?
  public static boolean Const(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Const")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<const>");
    result_ = consumeToken(builder_, "const");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, FieldType(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, DefinitionName(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQUALS)) && result_;
    result_ = pinned_ && report_error_(builder_, ConstValue(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Const_5(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(CONST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // ListSeparator?
  private static boolean Const_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Const_5")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' (ConstValue ListSeparator?)* ']'
  public static boolean ConstList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstList")) return false;
    if (!nextTokenIs(builder_, LEFTBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LEFTBRACKET);
    result_ = result_ && ConstList_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHTBRACKET);
    if (result_) {
      marker_.done(CONST_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // (ConstValue ListSeparator?)*
  private static boolean ConstList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstList_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!ConstList_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "ConstList_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ConstValue ListSeparator?
  private static boolean ConstList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstList_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = ConstValue(builder_, level_ + 1);
    result_ = result_ && ConstList_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ListSeparator?
  private static boolean ConstList_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstList_1_0_1")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' (ConstValue ':' ConstValue ListSeparator?)* '}'
  public static boolean ConstMap(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstMap")) return false;
    if (!nextTokenIs(builder_, LEFTCURLYBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LEFTCURLYBRACE);
    result_ = result_ && ConstMap_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHTCURLYBRACE);
    if (result_) {
      marker_.done(CONST_MAP);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // (ConstValue ':' ConstValue ListSeparator?)*
  private static boolean ConstMap_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstMap_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!ConstMap_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "ConstMap_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ConstValue ':' ConstValue ListSeparator?
  private static boolean ConstMap_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstMap_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = ConstValue(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && ConstValue(builder_, level_ + 1);
    result_ = result_ && ConstMap_1_0_3(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ListSeparator?
  private static boolean ConstMap_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstMap_1_0_3")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IntConstant | DoubleConstant | Literal | Identifier | ConstList | ConstMap
  public static boolean ConstValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstValue")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<const value>");
    result_ = IntConstant(builder_, level_ + 1);
    if (!result_) result_ = DoubleConstant(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, LITERAL);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = ConstList(builder_, level_ + 1);
    if (!result_) result_ = ConstMap(builder_, level_ + 1);
    if (result_) {
      marker_.done(CONST_VALUE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // MapType | SetType | ListType
  static boolean ContainerType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContainerType")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = MapType(builder_, level_ + 1);
    if (!result_) result_ = SetType(builder_, level_ + 1);
    if (!result_) result_ = ListType(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // 'cpp_type' Literal
  public static boolean CppType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CppType")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<cpp type>");
    result_ = consumeToken(builder_, "cpp_type");
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, LITERAL);
    if (result_ || pinned_) {
      marker_.done(CPP_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean CustomType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomType")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, IDENTIFIER);
    if (result_) {
      marker_.done(CUSTOM_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean DefinitionName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefinitionName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, IDENTIFIER);
    if (result_) {
      marker_.done(DEFINITION_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // topLevelElement*
  static boolean Document(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Document")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!topLevelElement(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "Document");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // ('+' | '-')? Number
  public static boolean DoubleConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DoubleConstant")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<double constant>");
    result_ = DoubleConstant_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, NUMBER);
    if (result_) {
      marker_.done(DOUBLE_CONSTANT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ('+' | '-')?
  private static boolean DoubleConstant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DoubleConstant_0")) return false;
    DoubleConstant_0_0(builder_, level_ + 1);
    return true;
  }

  // '+' | '-'
  private static boolean DoubleConstant_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DoubleConstant_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // 'enum' DefinitionName '{' enumFields '}' TypeAnnotations?
  public static boolean Enum(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Enum")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<enum>");
    result_ = consumeToken(builder_, "enum");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, enumFields(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHTCURLYBRACE)) && result_;
    result_ = pinned_ && Enum_5(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(ENUM);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // TypeAnnotations?
  private static boolean Enum_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Enum_5")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'exception' DefinitionName '{' fields '}' TypeAnnotations?
  public static boolean Exception(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Exception")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<exception>");
    result_ = consumeToken(builder_, "exception");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, fields(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHTCURLYBRACE)) && result_;
    result_ = pinned_ && Exception_5(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(EXCEPTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // TypeAnnotations?
  private static boolean Exception_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Exception_5")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FieldID? FieldReq? FieldType DefinitionName ('=' ConstValue)? XsdFieldOptions TypeAnnotations? ListSeparator?
  public static boolean Field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<field>");
    result_ = Field_0(builder_, level_ + 1);
    result_ = result_ && Field_1(builder_, level_ + 1);
    result_ = result_ && FieldType(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Field_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, XsdFieldOptions(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, Field_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Field_7(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(FIELD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // FieldID?
  private static boolean Field_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field_0")) return false;
    FieldID(builder_, level_ + 1);
    return true;
  }

  // FieldReq?
  private static boolean Field_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field_1")) return false;
    FieldReq(builder_, level_ + 1);
    return true;
  }

  // ('=' ConstValue)?
  private static boolean Field_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field_4")) return false;
    Field_4_0(builder_, level_ + 1);
    return true;
  }

  // '=' ConstValue
  private static boolean Field_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && ConstValue(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // TypeAnnotations?
  private static boolean Field_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field_6")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  // ListSeparator?
  private static boolean Field_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Field_7")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IntConstant ':'
  public static boolean FieldID(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldID")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<field id>");
    result_ = IntConstant(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    if (result_) {
      marker_.done(FIELD_ID);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // 'required' | 'optional'
  public static boolean FieldReq(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldReq")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<field req>");
    result_ = consumeToken(builder_, "required");
    if (!result_) result_ = consumeToken(builder_, "optional");
    if (result_) {
      marker_.done(FIELD_REQ);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // BaseType | ContainerType | CustomType
  public static boolean FieldType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldType")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<field type>");
    result_ = BaseType(builder_, level_ + 1);
    if (!result_) result_ = ContainerType(builder_, level_ + 1);
    if (!result_) result_ = CustomType(builder_, level_ + 1);
    if (result_) {
      marker_.done(FIELD_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // 'oneway'? FunctionType DefinitionName '(' fieldsWithBraceRecovery ')' Throws? TypeAnnotations?
  public static boolean Function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<function>");
    result_ = Function_0(builder_, level_ + 1);
    result_ = result_ && FunctionType(builder_, level_ + 1);
    result_ = result_ && DefinitionName(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LEFTBRACE));
    result_ = pinned_ && report_error_(builder_, fieldsWithBraceRecovery(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHTBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, Function_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Function_7(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(FUNCTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // 'oneway'?
  private static boolean Function_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_0")) return false;
    consumeToken(builder_, "oneway");
    return true;
  }

  // Throws?
  private static boolean Function_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_6")) return false;
    Throws(builder_, level_ + 1);
    return true;
  }

  // TypeAnnotations?
  private static boolean Function_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function_7")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'void' | FieldType
  public static boolean FunctionType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionType")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<function type>");
    result_ = consumeToken(builder_, "void");
    if (!result_) result_ = FieldType(builder_, level_ + 1);
    if (result_) {
      marker_.done(FUNCTION_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // ('include' | 'cpp_include') Literal
  public static boolean Include(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Include")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<include>");
    result_ = Include_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, LITERAL);
    if (result_ || pinned_) {
      marker_.done(INCLUDE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // 'include' | 'cpp_include'
  private static boolean Include_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Include_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "include");
    if (!result_) result_ = consumeToken(builder_, "cpp_include");
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ('+' | '-')? Integer
  public static boolean IntConstant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IntConstant")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<int constant>");
    result_ = IntConstant_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, INTEGER);
    if (result_) {
      marker_.done(INT_CONSTANT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ('+' | '-')?
  private static boolean IntConstant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IntConstant_0")) return false;
    IntConstant_0_0(builder_, level_ + 1);
    return true;
  }

  // '+' | '-'
  private static boolean IntConstant_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IntConstant_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ',' | ';'
  public static boolean ListSeparator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ListSeparator")) return false;
    if (!nextTokenIs(builder_, COMMA) && !nextTokenIs(builder_, SEMICOLON)
        && replaceVariants(builder_, 2, "<list separator>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<list separator>");
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    if (result_) {
      marker_.done(LIST_SEPARATOR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // 'list' '<' FieldType '>' CppType?
  public static boolean ListType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ListType")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<list type>");
    result_ = consumeToken(builder_, "list");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LT));
    result_ = pinned_ && report_error_(builder_, FieldType(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, GT)) && result_;
    result_ = pinned_ && ListType_4(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(LIST_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // CppType?
  private static boolean ListType_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ListType_4")) return false;
    CppType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'map' CppType? '<' FieldType ',' FieldType '>'
  public static boolean MapType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MapType")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<map type>");
    result_ = consumeToken(builder_, "map");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, MapType_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LT)) && result_;
    result_ = pinned_ && report_error_(builder_, FieldType(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COMMA)) && result_;
    result_ = pinned_ && report_error_(builder_, FieldType(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, GT) && result_;
    if (result_ || pinned_) {
      marker_.done(MAP_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // CppType?
  private static boolean MapType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MapType_1")) return false;
    CppType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // std_namespace | php_namespace | xsd_namespace
  public static boolean Namespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Namespace")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<namespace>");
    result_ = std_namespace(builder_, level_ + 1);
    if (!result_) result_ = php_namespace(builder_, level_ + 1);
    if (!result_) result_ = xsd_namespace(builder_, level_ + 1);
    if (result_) {
      marker_.done(NAMESPACE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // Multiply | 'cpp' | 'java' | 'py' | 'py.twisted' | 'perl' | 'rb' | 'js' | 'st' |
  //                      'cocoa' | 'csharp' | 'c_glib' | 'go' | 'php' | 'delphi'
  public static boolean NamespaceScope(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamespaceScope")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<namespace scope>");
    result_ = consumeToken(builder_, MULTIPLY);
    if (!result_) result_ = consumeToken(builder_, "cpp");
    if (!result_) result_ = consumeToken(builder_, "java");
    if (!result_) result_ = consumeToken(builder_, "py");
    if (!result_) result_ = consumeToken(builder_, "py.twisted");
    if (!result_) result_ = consumeToken(builder_, "perl");
    if (!result_) result_ = consumeToken(builder_, "rb");
    if (!result_) result_ = consumeToken(builder_, "js");
    if (!result_) result_ = consumeToken(builder_, "st");
    if (!result_) result_ = consumeToken(builder_, "cocoa");
    if (!result_) result_ = consumeToken(builder_, "csharp");
    if (!result_) result_ = consumeToken(builder_, "c_glib");
    if (!result_) result_ = consumeToken(builder_, "go");
    if (!result_) result_ = consumeToken(builder_, "php");
    if (!result_) result_ = consumeToken(builder_, "delphi");
    if (result_) {
      marker_.done(NAMESPACE_SCOPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // 'senum' DefinitionName '{' senumBody '}' TypeAnnotations?
  public static boolean Senum(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Senum")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<senum>");
    result_ = consumeToken(builder_, "senum");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, senumBody(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHTCURLYBRACE)) && result_;
    result_ = pinned_ && Senum_5(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(SENUM);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // TypeAnnotations?
  private static boolean Senum_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Senum_5")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'service' DefinitionName ( 'extends' ServiceSuperName )? '{' serviceBody '}' TypeAnnotations?
  public static boolean Service(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Service")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<service>");
    result_ = consumeToken(builder_, "service");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Service_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, serviceBody(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHTCURLYBRACE)) && result_;
    result_ = pinned_ && Service_6(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(SERVICE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // ( 'extends' ServiceSuperName )?
  private static boolean Service_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Service_2")) return false;
    Service_2_0(builder_, level_ + 1);
    return true;
  }

  // 'extends' ServiceSuperName
  private static boolean Service_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Service_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "extends");
    result_ = result_ && ServiceSuperName(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // TypeAnnotations?
  private static boolean Service_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Service_6")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean ServiceSuperName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ServiceSuperName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, IDENTIFIER);
    if (result_) {
      marker_.done(SERVICE_SUPER_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // 'set' CppType? '<' FieldType '>'
  public static boolean SetType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<set type>");
    result_ = consumeToken(builder_, "set");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, SetType_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LT)) && result_;
    result_ = pinned_ && report_error_(builder_, FieldType(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, GT) && result_;
    if (result_ || pinned_) {
      marker_.done(SET_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // CppType?
  private static boolean SetType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType_1")) return false;
    CppType(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'struct' DefinitionName 'xsd_all'? '{' fields '}' TypeAnnotations?
  public static boolean Struct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Struct")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<struct>");
    result_ = consumeToken(builder_, "struct");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Struct_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, fields(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHTCURLYBRACE)) && result_;
    result_ = pinned_ && Struct_6(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(STRUCT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // 'xsd_all'?
  private static boolean Struct_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Struct_2")) return false;
    consumeToken(builder_, "xsd_all");
    return true;
  }

  // TypeAnnotations?
  private static boolean Struct_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Struct_6")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'throws' '(' fieldsWithBraceRecovery ')'
  public static boolean Throws(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Throws")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<throws>");
    result_ = consumeToken(builder_, "throws");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LEFTBRACE));
    result_ = pinned_ && report_error_(builder_, fieldsWithBraceRecovery(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RIGHTBRACE) && result_;
    if (result_ || pinned_) {
      marker_.done(THROWS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Identifier '=' Literal ListSeparator?
  public static boolean TypeAnnotation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAnnotation")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, EQUALS);
    result_ = result_ && consumeToken(builder_, LITERAL);
    result_ = result_ && TypeAnnotation_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(TYPE_ANNOTATION);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ListSeparator?
  private static boolean TypeAnnotation_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAnnotation_3")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TypeAnnotation*
  public static boolean TypeAnnotationList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAnnotationList")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<type annotation list>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!TypeAnnotation(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "TypeAnnotationList");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(TYPE_ANNOTATION_LIST);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // '(' TypeAnnotationList ')'
  public static boolean TypeAnnotations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAnnotations")) return false;
    if (!nextTokenIs(builder_, LEFTBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LEFTBRACE);
    result_ = result_ && TypeAnnotationList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHTBRACE);
    if (result_) {
      marker_.done(TYPE_ANNOTATIONS);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // 'typedef' FieldType DefinitionName TypeAnnotations?
  public static boolean Typedef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Typedef")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<typedef>");
    result_ = consumeToken(builder_, "typedef");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, FieldType(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, DefinitionName(builder_, level_ + 1)) && result_;
    result_ = pinned_ && Typedef_3(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(TYPEDEF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // TypeAnnotations?
  private static boolean Typedef_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Typedef_3")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'union' DefinitionName 'xsd_all'? '{' fields '}'
  public static boolean Union(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Union")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<union>");
    result_ = consumeToken(builder_, "union");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, DefinitionName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Union_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, fields(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RIGHTCURLYBRACE) && result_;
    if (result_ || pinned_) {
      marker_.done(UNION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // 'xsd_all'?
  private static boolean Union_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Union_2")) return false;
    consumeToken(builder_, "xsd_all");
    return true;
  }

  /* ********************************************************** */
  // 'xsd_attrs' '{' fields '}'
  public static boolean XsdAttrs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "XsdAttrs")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<xsd attrs>");
    result_ = consumeToken(builder_, "xsd_attrs");
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LEFTCURLYBRACE));
    result_ = pinned_ && report_error_(builder_, fields(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RIGHTCURLYBRACE) && result_;
    if (result_ || pinned_) {
      marker_.done(XSD_ATTRS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // 'xsd_optional'? 'xsd_nillable'? XsdAttrs?
  public static boolean XsdFieldOptions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "XsdFieldOptions")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<xsd field options>");
    result_ = XsdFieldOptions_0(builder_, level_ + 1);
    result_ = result_ && XsdFieldOptions_1(builder_, level_ + 1);
    result_ = result_ && XsdFieldOptions_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(XSD_FIELD_OPTIONS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // 'xsd_optional'?
  private static boolean XsdFieldOptions_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "XsdFieldOptions_0")) return false;
    consumeToken(builder_, "xsd_optional");
    return true;
  }

  // 'xsd_nillable'?
  private static boolean XsdFieldOptions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "XsdFieldOptions_1")) return false;
    consumeToken(builder_, "xsd_nillable");
    return true;
  }

  // XsdAttrs?
  private static boolean XsdFieldOptions_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "XsdFieldOptions_2")) return false;
    XsdAttrs(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // !(')')
  static boolean braceRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "braceRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !braceRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // (')')
  private static boolean braceRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "braceRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, RIGHTBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // !('}')
  static boolean curlyBraceRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curlyBraceRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !curlyBraceRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // ('}')
  private static boolean curlyBraceRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curlyBraceRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, RIGHTCURLYBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // Identifier ('=' IntConstant)? TypeAnnotations? ListSeparator?
  public static boolean enumField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumField")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && enumField_1(builder_, level_ + 1);
    result_ = result_ && enumField_2(builder_, level_ + 1);
    result_ = result_ && enumField_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(ENUM_FIELD);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ('=' IntConstant)?
  private static boolean enumField_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumField_1")) return false;
    enumField_1_0(builder_, level_ + 1);
    return true;
  }

  // '=' IntConstant
  private static boolean enumField_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumField_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && IntConstant(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // TypeAnnotations?
  private static boolean enumField_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumField_2")) return false;
    TypeAnnotations(builder_, level_ + 1);
    return true;
  }

  // ListSeparator?
  private static boolean enumField_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumField_3")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // !('}' | Identifier)
  static boolean enumFieldRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumFieldRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !enumFieldRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // '}' | Identifier
  private static boolean enumFieldRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumFieldRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, RIGHTCURLYBRACE);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // enumField*
  public static boolean enumFields(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumFields")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<enum fields>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!enumField(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "enumFields");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(ENUM_FIELDS);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // !(')' | '+' | '-' | 'binary' | 'bool' | 'byte' | 'double' | 'i16' | 'i32' | 'i64' | 'list' |
  //                             'map' | 'optional' | 'required' | 'set' | 'slist' | 'string' | '}'| Integer | Identifier | Number )
  static boolean fieldRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fieldRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !fieldRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // ')' | '+' | '-' | 'binary' | 'bool' | 'byte' | 'double' | 'i16' | 'i32' | 'i64' | 'list' |
  //                             'map' | 'optional' | 'required' | 'set' | 'slist' | 'string' | '}'| Integer | Identifier | Number
  private static boolean fieldRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fieldRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, RIGHTBRACE);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, "binary");
    if (!result_) result_ = consumeToken(builder_, "bool");
    if (!result_) result_ = consumeToken(builder_, "byte");
    if (!result_) result_ = consumeToken(builder_, "double");
    if (!result_) result_ = consumeToken(builder_, "i16");
    if (!result_) result_ = consumeToken(builder_, "i32");
    if (!result_) result_ = consumeToken(builder_, "i64");
    if (!result_) result_ = consumeToken(builder_, "list");
    if (!result_) result_ = consumeToken(builder_, "map");
    if (!result_) result_ = consumeToken(builder_, "optional");
    if (!result_) result_ = consumeToken(builder_, "required");
    if (!result_) result_ = consumeToken(builder_, "set");
    if (!result_) result_ = consumeToken(builder_, "slist");
    if (!result_) result_ = consumeToken(builder_, "string");
    if (!result_) result_ = consumeToken(builder_, RIGHTCURLYBRACE);
    if (!result_) result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // Field*
  public static boolean fields(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<fields>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!Field(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "fields");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(FIELDS);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // Field*
  static boolean fieldsWithBraceRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fieldsWithBraceRecovery")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!Field(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "fieldsWithBraceRecovery");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // !('binary' | 'bool' | 'byte' | 'double' | 'i16' | 'i32' | 'i64' | 'list' | 'map' |
  //                                'oneway' | 'set' | 'slist' | 'string' | 'void' | '}' | Identifier | ListSeparator)
  static boolean functionRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !functionRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // 'binary' | 'bool' | 'byte' | 'double' | 'i16' | 'i32' | 'i64' | 'list' | 'map' |
  //                                'oneway' | 'set' | 'slist' | 'string' | 'void' | '}' | Identifier | ListSeparator
  private static boolean functionRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "binary");
    if (!result_) result_ = consumeToken(builder_, "bool");
    if (!result_) result_ = consumeToken(builder_, "byte");
    if (!result_) result_ = consumeToken(builder_, "double");
    if (!result_) result_ = consumeToken(builder_, "i16");
    if (!result_) result_ = consumeToken(builder_, "i32");
    if (!result_) result_ = consumeToken(builder_, "i64");
    if (!result_) result_ = consumeToken(builder_, "list");
    if (!result_) result_ = consumeToken(builder_, "map");
    if (!result_) result_ = consumeToken(builder_, "oneway");
    if (!result_) result_ = consumeToken(builder_, "set");
    if (!result_) result_ = consumeToken(builder_, "slist");
    if (!result_) result_ = consumeToken(builder_, "string");
    if (!result_) result_ = consumeToken(builder_, "void");
    if (!result_) result_ = consumeToken(builder_, RIGHTCURLYBRACE);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = ListSeparator(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // !('}')
  static boolean functionsRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionsRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !functionsRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // ('}')
  private static boolean functionsRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionsRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, RIGHTCURLYBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // 'php_namespace' Literal
  static boolean php_namespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "php_namespace")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeToken(builder_, "php_namespace");
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, LITERAL);
    if (!result_ && !pinned_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Literal ListSeparator?
  public static boolean semunField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semunField")) return false;
    if (!nextTokenIs(builder_, LITERAL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LITERAL);
    result_ = result_ && semunField_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(SEMUN_FIELD);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ListSeparator?
  private static boolean semunField_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semunField_1")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // !('}' | Literal)
  static boolean semunFieldRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semunFieldRecovery")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !semunFieldRecovery_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // '}' | Literal
  private static boolean semunFieldRecovery_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semunFieldRecovery_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, RIGHTCURLYBRACE);
    if (!result_) result_ = consumeToken(builder_, LITERAL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // semunField*
  public static boolean senumBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "senumBody")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<senum body>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!semunField(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "senumBody");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(SENUM_BODY);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  /* ********************************************************** */
  // (Function ListSeparator?)*
  public static boolean serviceBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "serviceBody")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<service body>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!serviceBody_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "serviceBody");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(SERVICE_BODY);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

  // Function ListSeparator?
  private static boolean serviceBody_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "serviceBody_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = Function(builder_, level_ + 1);
    result_ = result_ && serviceBody_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ListSeparator?
  private static boolean serviceBody_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "serviceBody_0_1")) return false;
    ListSeparator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // 'namespace' (
  //     ( NamespaceScope Identifier ) |
  //     ( 'smalltalk.category' STIdentifier ) |
  //     ( 'smalltalk.prefix' Identifier )
  // )
  static boolean std_namespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "std_namespace")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeToken(builder_, "namespace");
    pinned_ = result_; // pin = 1
    result_ = result_ && std_namespace_1(builder_, level_ + 1);
    if (!result_ && !pinned_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // ( NamespaceScope Identifier ) |
  //     ( 'smalltalk.category' STIdentifier ) |
  //     ( 'smalltalk.prefix' Identifier )
  private static boolean std_namespace_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "std_namespace_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = std_namespace_1_0(builder_, level_ + 1);
    if (!result_) result_ = std_namespace_1_1(builder_, level_ + 1);
    if (!result_) result_ = std_namespace_1_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // NamespaceScope Identifier
  private static boolean std_namespace_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "std_namespace_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = NamespaceScope(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // 'smalltalk.category' STIdentifier
  private static boolean std_namespace_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "std_namespace_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "smalltalk.category");
    result_ = result_ && consumeToken(builder_, STIDENTIFIER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // 'smalltalk.prefix' Identifier
  private static boolean std_namespace_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "std_namespace_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "smalltalk.prefix");
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // Include | Namespace |
  //                              Const | Typedef | Enum | Senum | Struct | Union | Exception | Service
  static boolean topLevelElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topLevelElement")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = Include(builder_, level_ + 1);
    if (!result_) result_ = Namespace(builder_, level_ + 1);
    if (!result_) result_ = Const(builder_, level_ + 1);
    if (!result_) result_ = Typedef(builder_, level_ + 1);
    if (!result_) result_ = Enum(builder_, level_ + 1);
    if (!result_) result_ = Senum(builder_, level_ + 1);
    if (!result_) result_ = Struct(builder_, level_ + 1);
    if (!result_) result_ = Union(builder_, level_ + 1);
    if (!result_) result_ = Exception(builder_, level_ + 1);
    if (!result_) result_ = Service(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // !('const' | 'cpp_include' | 'enum' | 'exception' | 'include' | 'namespace' |
  //                               'php_namespace' | 'senum' | 'service' | 'struct' | 'typedef' | 'union' |
  //                               'xsd_namespace' )
  static boolean topLevelRecover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topLevelRecover")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !topLevelRecover_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // 'const' | 'cpp_include' | 'enum' | 'exception' | 'include' | 'namespace' |
  //                               'php_namespace' | 'senum' | 'service' | 'struct' | 'typedef' | 'union' |
  //                               'xsd_namespace'
  private static boolean topLevelRecover_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topLevelRecover_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "const");
    if (!result_) result_ = consumeToken(builder_, "cpp_include");
    if (!result_) result_ = consumeToken(builder_, "enum");
    if (!result_) result_ = consumeToken(builder_, "exception");
    if (!result_) result_ = consumeToken(builder_, "include");
    if (!result_) result_ = consumeToken(builder_, "namespace");
    if (!result_) result_ = consumeToken(builder_, "php_namespace");
    if (!result_) result_ = consumeToken(builder_, "senum");
    if (!result_) result_ = consumeToken(builder_, "service");
    if (!result_) result_ = consumeToken(builder_, "struct");
    if (!result_) result_ = consumeToken(builder_, "typedef");
    if (!result_) result_ = consumeToken(builder_, "union");
    if (!result_) result_ = consumeToken(builder_, "xsd_namespace");
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // 'xsd_namespace' Literal
  static boolean xsd_namespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xsd_namespace")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeToken(builder_, "xsd_namespace");
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, LITERAL);
    if (!result_ && !pinned_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

}
