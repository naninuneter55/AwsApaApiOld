/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.aws_apa.operation;

import com.wind_now.aws_apa.util.OnoLogger;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author ono
 */
public abstract class Builder {
    static final Logger logger = OnoLogger.getLogger();
    public abstract Object invoke(List<String> keywords);
}
