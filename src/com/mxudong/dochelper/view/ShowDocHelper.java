package com.mxudong.dochelper.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.mxudong.dochelper.common.GetSetterManager;
import org.jetbrains.annotations.NotNull;

/**
 * @author Dong
 * <p>
 * Class Name : ShowDocHelper
 * Create Time : 14:25
 * Create Date : 2019/3/18
 * Project : Java_Doc Helper
 */

public class ShowDocHelper implements ToolWindowFactory {



    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ShowDocHelperView showDocHelperView = new ShowDocHelperView(toolWindow, project);
        GetSetterManager.setShowDocHelperView(showDocHelperView);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(showDocHelperView.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);

    }

    @Override
    public boolean shouldBeAvailable(@NotNull Project project) {

        return true;
    }

    @Override
    public void init(ToolWindow window) {

    }

    @Override
    public boolean isDoNotActivateOnStart() {

        return false;
    }

}
