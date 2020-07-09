package org.wso2.custom.user.store.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.user.api.UserStoreManager;
import org.wso2.custom.user.store.CustomJDBCUserStoreManager;

/**
 * Custom User Store Manager Component
 */
@Component(name = "custom.jdbc.user.store.mgt.component",
           immediate = true)
public class CustomJDBCUserStoreMgtComponent {

    private static Log log = LogFactory.getLog(CustomJDBCUserStoreMgtComponent.class);

    @Activate
    protected void activate(ComponentContext context) {

        context.getBundleContext()
                .registerService(UserStoreManager.class.getName(), new CustomJDBCUserStoreManager(), null);
        log.info("Custom JDBC user-store manager activated successfully.");
    }

}
