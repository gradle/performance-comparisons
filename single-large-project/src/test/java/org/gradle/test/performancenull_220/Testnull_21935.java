package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21935 {
    private final Productionnull_21935 production = new Productionnull_21935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}