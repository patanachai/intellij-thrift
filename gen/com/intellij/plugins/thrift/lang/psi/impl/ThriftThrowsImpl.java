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

public class ThriftThrowsImpl extends ThriftPsiCompositeElementImpl implements ThriftThrows {

  public ThriftThrowsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<ThriftField> getFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ThriftField.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitThrows(this);
    else super.accept(visitor);
  }

}
