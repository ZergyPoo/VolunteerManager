<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="organizationManagement.title"/></title>
    <meta name="menu" content="OrganizationManagement"/>
</head>

<body class="organizationManagement"/>

<div id="actions" class="form-actions">
    <a class="btn btn-primary" href="<c:url value="/admin/editOrganization"/>" >
        <i class="icon-plus icon-white"></i> <fmt:message key="button.add"/>
    </a>
</div>
<div class="span10">
    <display:table name="organizations" class="table table-condensed table-striped table-hover" requestURI="" id="orgList" export="true" pagesize="25">
        <display:column value="view" url="/viewOrganization" media="html"
                        paramId="id" paramProperty="id" class="linkColumn"/>
        <display:column value="edit" href="editOrganization" media="html"
                        paramId="id" paramProperty="id" class="linkColumn"/>
        <display:column property="id" media="csv excel xml pdf" titleKey="organization.id"/>
        <display:column property="name" titleKey="organization.name" sortable="true"/>
        <display:column property="address.city" titleKey="organization.address.city" sortable="true"/>
    </display:table>
</div>