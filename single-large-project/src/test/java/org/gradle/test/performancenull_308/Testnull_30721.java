package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30721 {
    private final Productionnull_30721 production = new Productionnull_30721("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}