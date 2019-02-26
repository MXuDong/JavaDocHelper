package com.mxudong.dochelper.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
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
    }
}
