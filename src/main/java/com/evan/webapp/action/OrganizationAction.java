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
    private Long id;
    private Organization organization;

    private static final String ACTION_LIST = "list";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public List<Organization> getOrganizations() {
        return organizations;
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
        organizations = organizationManager.getAll();
        return ACTION_LIST;
    }

    public String delete() {
        organizationManager.remove(organization);
        String key = "organization.deleted";
        saveMessage(getText(key));

        return SUCCESS;
    }

    public String save() throws Exception {
        if (this.cancel != null) {
            return CANCEL;
        }

        if (this.delete != null) {
            return delete();
        }

        organizationManager.save(this.organization);

        String key = (organization.getId() == null) ? "organization.added" : "organization.updated";
        saveMessage(getText(key));

        return SUCCESS;
    }

    public String edit() {
        if (id != null) {
            organization = organizationManager.get(id);
        } else {
            organization = new Organization();
        }

        return SUCCESS;
    }
}
