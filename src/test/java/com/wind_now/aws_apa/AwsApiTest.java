package com.wind_now.aws_apa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import am.ik.aws.apa.AwsApaRequester;
import am.ik.aws.apa.AwsApaRequesterImpl;
import am.ik.aws.apa.jaxws.ItemSearchRequest;
import am.ik.aws.apa.jaxws.ItemSearchResponse;
import com.wind_now.aws_apa.util.OnoLogger;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ono
 */
public class AwsApiTest {

    static final Logger logger = OnoLogger.getLogger();

    public AwsApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void itemSearch() {
        logger.info("getCategoryMembers");
        List<String>keywords = Arrays.asList("吹奏楽");
        Operation op = new Operation();
        ItemSearchResponse res = op.itemSearch(keywords);
        String actual = res.getItems().get(0).getRequest().getIsValid();
        String expected = "True";
        assertThat(actual, is(actual));
        logger.info(res.getItems().get(0).getItem().get(2).getItemAttributes().getTitle());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
