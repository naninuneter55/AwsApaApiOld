/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.aws_apa.operation;

import am.ik.aws.apa.AwsApaRequester;
import am.ik.aws.apa.AwsApaRequesterImpl;
import am.ik.aws.apa.jaxws.ItemSearchRequest;
import am.ik.aws.apa.jaxws.ItemSearchResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ono
 */
public class ItemSearchBuilder extends Builder {

    private static final String AWS_ENDPOINT = "https://ecs.amazonaws.jp";

    @Override
    public ItemSearchResponse invoke(List<String> keywords) {

        String awsAccesskeyId = System.getenv("AWS_ACCESSKEY_ID");
        String awsSecretAccesskey = System.getenv("AWS_SECRET_ACCESSKEY");
        String awsAssociateTag = System.getenv("AWS_ASSOCIATE_TAG");
        AwsApaRequester requester = new AwsApaRequesterImpl(AWS_ENDPOINT, awsAccesskeyId, awsSecretAccesskey, awsAssociateTag);
        ItemSearchRequest request = new ItemSearchRequest();
        request.setSearchIndex("Books");
        request.setKeywords(String.join("|", keywords));
        ItemSearchResponse response = requester.itemSearch(request);
        return (response);
    }

}
