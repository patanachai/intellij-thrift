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

public class ThriftServiceBodyImpl extends ThriftPsiCompositeElementImpl implements ThriftServiceBody {

  public ThriftServiceBodyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<ThriftFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ThriftFunction.class);
  }

  @Override
  @NotNull
  public List<ThriftListSeparator> getListSeparatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ThriftListSeparator.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitServiceBody(this);
    else super.accept(visitor);
  }

}
