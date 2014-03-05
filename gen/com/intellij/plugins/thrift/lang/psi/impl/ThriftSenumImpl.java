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

public class ThriftSenumImpl extends ThriftTopLevelDeclarationImpl implements ThriftSenum {

  public ThriftSenumImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public ThriftDefinitionName getDefinitionName() {
    return findChildByClass(ThriftDefinitionName.class);
  }

  @Override
  @Nullable
  public ThriftTypeAnnotations getTypeAnnotations() {
    return findChildByClass(ThriftTypeAnnotations.class);
  }

  @Override
  @Nullable
  public ThriftSenumBody getSenumBody() {
    return findChildByClass(ThriftSenumBody.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ThriftVisitor) ((ThriftVisitor)visitor).visitSenum(this);
    else super.accept(visitor);
  }

}
