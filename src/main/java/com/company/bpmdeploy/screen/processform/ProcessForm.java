package com.company.bpmdeploy.screen.processform;


import io.jmix.bpmui.processform.ProcessFormContext;
import io.jmix.ui.component.Button;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@io.jmix.bpmui.processform.annotation.ProcessForm
@UiController("demo_ProcessForm")
@UiDescriptor("process-form.xml")
public class ProcessForm extends Screen {

    @Autowired
    private ProcessFormContext processFormContext;

    @Subscribe("startProcessBtn")
    public void onStartProcessBtnClick(Button.ClickEvent event) {
        processFormContext.processStarting().start();
        closeWithDefaultAction();
    }
}