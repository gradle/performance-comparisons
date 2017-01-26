package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10061 {
    private final Productionnull_10061 production = new Productionnull_10061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}