package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33264 {
    private final Productionnull_33264 production = new Productionnull_33264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}