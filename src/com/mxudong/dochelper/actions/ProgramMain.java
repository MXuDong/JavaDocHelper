package com.mxudong.dochelper.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import com.mxudong.dochelper.common.DescriptionItem;
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

        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
        Editor editor = e.getData(CommonDataKeys.EDITOR);

        if(editor == null || psiFile == null){
            return;
        }

        Document document = editor.getDocument();
        ShowDocHelperView showDocHelperView = GetSetterManager.getShowDocHelperView();
        DescriptionItem descriptionItem = new DescriptionItem(document.getText());
        if(showDocHelperView != null){
            showDocHelperView.changeText("");
            showDocHelperView.changeText(descriptionItem.getDescInfo());
        }
    }
}
