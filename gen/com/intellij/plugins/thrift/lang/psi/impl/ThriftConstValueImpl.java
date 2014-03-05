// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.thrift.lang.lexer.ThriftTokenTypes.*;
import com.intellij.plugins.thrift.lang.psi.*;
import com.intellij.plugins.thrift.util.ThriftPsiUtil;

public class ThriftConstValueImpl extends ThriftPsiCompositeElementImpl implements ThriftConstValue {

  public ThriftConstValueImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public ThriftConstList getConstList() {
    return findChildByClass(ThriftConstList.class);
  }

  @Override
  @Nullable
  public ThriftConstMap getConstMap() {
    return findChildByClass(ThriftConstMap.class);
  }

  @Override
  @Nullable
  public ThriftDoubleConstant getDoubleConstant() {
    return findChildByClass(ThriftDoubleConstant.class);
  }

  @Override
  @Nullable
  public ThriftIntConstant getIntConstant() {
    return findChildByClass(ThriftIntConstant.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitConstValue(this);
    else super.accept(visitor);
  }

}
