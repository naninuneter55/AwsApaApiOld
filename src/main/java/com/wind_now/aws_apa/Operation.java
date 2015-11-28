package com.wind_now.aws_apa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import am.ik.aws.apa.jaxws.ItemSearchResponse;
import com.wind_now.aws_apa.operation.Builder;
import com.wind_now.aws_apa.operation.Director;
import com.wind_now.aws_apa.operation.ItemSearchBuilder;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ono
 */
public class Operation implements Serializable{

    public ItemSearchResponse itemSearch(List<String> keywords) {
        return(this.operation(keywords, new ItemSearchBuilder(), ItemSearchResponse.class));
    }

    private <T, S> T operation(S arg, Builder builder, Class<T> clazz){
        T result;
        Director director = new Director(builder);
        result = (T)director.construct(arg, clazz);
        return result;
    }
}
