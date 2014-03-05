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

public class ThriftDefinitionNameImpl extends ThriftPsiCompositeElementImpl implements ThriftDefinitionName {

  public ThriftDefinitionNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitDefinitionName(this);
    else super.accept(visitor);
  }

  @NotNull
  public PsiElement setName(String name) {
    return ThriftPsiUtil.setName(this, name);
  }

  @Nullable
  @NonNls
  public String getName() {
    return ThriftPsiUtil.getName(this);
  }

  @NotNull
  public PsiElement getNameIdentifier() {
    return ThriftPsiUtil.getNameIdentifier(this);
  }

}
