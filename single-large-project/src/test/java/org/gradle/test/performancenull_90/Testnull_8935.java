package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8935 {
    private final Productionnull_8935 production = new Productionnull_8935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}