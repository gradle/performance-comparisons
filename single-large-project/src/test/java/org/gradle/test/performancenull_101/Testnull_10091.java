package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10091 {
    private final Productionnull_10091 production = new Productionnull_10091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}