package org.kie.server.samples;

import org.kie.server.services.jbpm.ui.form.render.AbstractFormRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CustomFormRenderer extends AbstractFormRenderer {
    
    private static final Logger logger = LoggerFactory.getLogger(CustomFormRenderer.class);

    public CustomFormRenderer() {
        super(null,  null);
    }
    
    public CustomFormRenderer(String serverPath, String resources) {
        super(serverPath, resources);
    }
    
    public String getName() {
        return "custom";
    }

    @Override
    protected void loadTemplates() {
        loadTemplate(MASTER_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/master-template.html"));
        loadTemplate(PROCESS_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/process-layout-template.html"));
        loadTemplate(TASK_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/task-layout-template.html"));
        loadTemplate(FORM_GROUP_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/input-form-group-template.html"));
        loadTemplate(HEADER_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/header-template.html"));
        loadTemplate(CASE_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/case-layout-template.html"));
        loadTemplate(TABLE_LAYOUT_TEMPLATE, this.getClass().getResourceAsStream("/form-templates-providers/custom/table-template.html"));
        
        logger.info("Custom Form renderer templates loaded successfully.");
    }

}
