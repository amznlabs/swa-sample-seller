package com.github.amznlabs.swa_sample_seller.models;

import java.util.List;

public class SubscriptionsResponseJson {
    public Long nextCursor;
    public List<SubscriptionJson> subscriptions;
    public String access_token;
    public String scope;
    public String token_type;
    public Long expires_in;
}
