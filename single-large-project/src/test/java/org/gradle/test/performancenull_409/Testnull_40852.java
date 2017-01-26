package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40852 {
    private final Productionnull_40852 production = new Productionnull_40852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}