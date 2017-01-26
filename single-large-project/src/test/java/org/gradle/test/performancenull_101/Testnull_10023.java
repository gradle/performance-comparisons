package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10023 {
    private final Productionnull_10023 production = new Productionnull_10023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}