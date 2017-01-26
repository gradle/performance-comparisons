package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25852 {
    private final Productionnull_25852 production = new Productionnull_25852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}