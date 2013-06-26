<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="organizationEdit.title"/></title>
    <meta name="menu" content="OrganizationManagement"/>
</head>

<body class="organizationEdit"/>

<div class="span2">
    <h2><fmt:message key="organization.detail.heading"/></h2>
</div>
<div class="span7">
    <s:form id="organizationForm" action="saveOrganization" method="post" cssClass="well form-horizontal" validate="true">
        <s:hidden key="organization.id"/>
        <s:textfield key="organization.name" maxLength="100" required="true"/>
        <s:textfield key="organization.address.address" required="true"/>
        <s:textfield key="organization.address.city" required="true"/>
        <s:textfield key="organization.address.province" required="true"/>
        <s:textfield key="organization.address.postalCode" required="true"/>
        <div id="actions" class="form-actions">
            <s:submit method="save" key="button.save" type="button"/>
            <c:if test="${not empty organization.id}">
                <s:submit type="button" cssClass="btn btn-danger" method="delete" key="button.delete"
                          onclick="return confirmDelete('Organization')" theme="simple">
                    <i class="icon-trash"></i>
                    <fmt:message key="button.delete"/>
                </s:submit>
            </c:if>
            <s:submit type="button" cssClass="btn" method="cancel" key="button.cancel" theme="simple">
                <i class="icon-remove"></i>
                <fmt:message key="button.cancel"/>
            </s:submit>
        </div>
    </s:form>
</div>
<script type="text/javascript">
    $(document).ready(function () {
        $("input[type='text']:visible:enabled:first", document.forms['personForm']).focus();
    });
</script>