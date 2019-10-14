/**
 * Copyright 2019 ForgeRock AS. All Rights Reserved
 *
 * Use of this code requires a commercial software license with ForgeRock AS.
 * or with one of its affiliates. All use shall be exclusively subject
 * to such license between the licensee and ForgeRock AS.
 */
package com.forgerock.openbanking.core.config;

import com.forgerock.openbanking.core.services.ApplicationApiClient;
import com.forgerock.openbanking.core.services.ApplicationApiClientImpl;
import com.forgerock.openbanking.core.services.CryptoApiClientImpl;
import com.forgerock.openbanking.jwt.services.CryptoApiClient;
import org.springframework.context.annotation.Bean;

public class JwkmsServiceConfiguration {

    @Bean
    public CryptoApiClient cryptoApiClient() {
        return new CryptoApiClientImpl();
    }

    @Bean
    public ApplicationApiClient applicationApiClient() { return new ApplicationApiClientImpl(); }
}