package org.wso2.custom.user.store;

import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.claim.ClaimManager;
import org.wso2.carbon.user.core.common.AuthenticationResult;
import org.wso2.carbon.user.core.jdbc.UniqueIDJDBCUserStoreManager;
import org.wso2.carbon.user.core.profile.ProfileConfigurationManager;

import java.util.Map;

/**
 * Custom JDBC User Store Manager
 */
public class CustomJDBCUserStoreManager extends UniqueIDJDBCUserStoreManager {

    public CustomJDBCUserStoreManager() {

    }

    public CustomJDBCUserStoreManager(RealmConfiguration realmConfig, int tenantId) throws UserStoreException {

        super(realmConfig, tenantId);
    }

    public CustomJDBCUserStoreManager(RealmConfiguration realmConfig, Map<String, Object> properties,
            ClaimManager claimManager, ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId)
            throws UserStoreException {

        super(realmConfig, properties, claimManager, profileManager, realm, tenantId);
    }

    public CustomJDBCUserStoreManager(RealmConfiguration realmConfig, Map<String, Object> properties,
            ClaimManager claimManager, ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId,
            boolean skipInitData) throws UserStoreException {

        super(realmConfig, properties, claimManager, profileManager, realm, tenantId, skipInitData);
    }

    @Override
    public AuthenticationResult doAuthenticateWithID(String preferredUserNameProperty, String preferredUserNameValue,
            Object credential, String profileName) throws UserStoreException {

        return super.doAuthenticateWithID(preferredUserNameProperty, preferredUserNameValue, credential, profileName);
    }

    @Override
    public boolean doAuthenticate(String userName, Object credential) throws UserStoreException {

        return super.doAuthenticate(userName, credential);
    }
}
