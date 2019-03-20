package com.mxudong.dochelper.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.javadoc.PsiDocTag;
import com.intellij.psi.util.PsiTreeUtil;
import com.mxudong.dochelper.common.DescUtil;
import com.mxudong.dochelper.common.GetSetterManager;
import com.mxudong.dochelper.view.ShowDocHelperView;
import org.jetbrains.annotations.NotNull;


/**
 *
 * @author Dong
 */

public class ProgramMain extends AnAction {
    public ProgramMain(){
        super("Show Java Doc");
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // TODO: insert action logic here

        Project project = e.getData(PlatformDataKeys.PROJECT);
        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
        Editor editor = e.getData(CommonDataKeys.EDITOR);

        if(editor == null || psiFile == null){
            return;
        }

        PsiElement element = psiFile.findElementAt(editor.getCaretModel().getOffset());
        Document document = editor.getDocument();
        String[] doc = DescUtil.GetDoc(document.getText());
        ShowDocHelperView showDocHelperView = GetSetterManager.getShowDocHelperView();
        if(showDocHelperView != null){
            showDocHelperView.changeText("");
            for(String str : doc){
                System.out.println(str);
                showDocHelperView.changeText(showDocHelperView.getText() + str);
            }
        }
    }
}
