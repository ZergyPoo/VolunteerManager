package com.evan.webapp.action;

import com.evan.model.Organization;
import com.evan.service.GenericManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: evank
 * Date: 6/17/13
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class OrganizationAction extends BaseAction {
    private GenericManager<Organization, Long> organizationManager;
    private List<Organization> organizations;
    private String id;

    private static final String ACTION_LIST = "list";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Autowired
    public void setOrganizationManager(GenericManager<Organization, Long> organizationManager) {
        this.organizationManager = organizationManager;
    }

    public void prepare() {
        System.out.println("this is a test");
    }

    public String execute() {
        return SUCCESS;
    }

    public String list() {
        return ACTION_LIST;
    }
}
