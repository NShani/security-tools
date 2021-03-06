

/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 */

package org.wso2.security.tools.zap.ext.zapwso2jiraplugin;

public class IssueCreatorConstants {

    // The name is public so that other extensions can access it
    public static final String NAME = "JiraIssueCreatorExtension";

    // The i18n prefix, by default the package name - defined in one place to make it easier
    // to copy and change this example
    public static final String PREFIX = "zapwso2jiraplugin";

    /**
     * The action of creating new Jira issues.
     */
    public static final String ACTION_CREATE_JIRA_ISSUE = "createJiraIssues";

    //is defined under every Jira project, when browsing an issue it will be the last parameter without the issue number
    public static final String ACTION_PARAM_PROJECT_KEY = "projectKey";

    //is URL upto the jira Login window, in WSO2 it is upto <URL>/jira
    public static final String ACTION_PARAM_BASEURL = "jiraBaseURL";

    /**
     * The mandatory parameter required for creating new Jira issues .
     */

    public static final String ACTION_PARAM_JIRAUSERNAME = "jiraUserName";
    public static final String ACTION_PARAM_JIRAPASSWORD = "jiraPassword";

    public static final String ACTION_PARAM_ASSIGNEE = "assignee";

    //issueLabel This is a custom feild defined in wso2 jira
    public static final String ACTION_PARAM_LABEL = "label";

    //product - You can define a product name, which will be used in the summary to Identify the Issue clearly
    public static final String ACTION_PARAM_PRODUCT = "product";

    // filePath- This is the file path where ZAP generates its report. This includes file name too.
    public static final String ACTION_PARAM_PATH = "filePath";

    public static final String ACTION_PARAM_WORKSPACE = "workspace";

    public static final String ACTION_PARAM_FOLDER = "backupPlace";

    public static final String SAX_FEATURE_PREFIX = "http://xml.org/sax/features/";

    public static final String EXTERNAL_GENERAL_ENTITIES_FEATURE = "external-general-entities";

    public static final String XERCES_FEATURE_PREFIX = "http://apache.org/xml/features/";

    public static final String LOAD_EXTERNAL_DTD_FEATURE = "nonvalidating/load-external-dtd";

    public static final String FEATURE_SECURE_PROCESSING = "http://javax.xml.XMLConstants/feature/secure-processing";

    public static final String EXTERNAL_PARAMETER_ENTITIES_FEATURE = "external-parameter-entities";

    public static final int ENTITY_EXPANSION_LIMIT = 0;

    public static final java.lang.String XERCES_PROPERTY_PREFIX = "http://apache.org/xml/properties/";

    public static final java.lang.String SECURITY_MANAGER_PROPERTY = "security-manager";

    public static final java.lang.String ATLASSIAN_TOKEN = "X-Atlassian-Token";

    public static final java.lang.String ATLASSIAN_AUTHORIZATION = "Authorization";


    /*JIRA accessing related constants*/

    public static final java.lang.String ACCESS_JIRA_ISSUES_ENDPOINT = "/rest/api/2/issue/";
    public static final java.lang.String ACCESS_JIRA_ATTACHMENT_ENDPOINT = "/rest/api/2/attachment/";

}
