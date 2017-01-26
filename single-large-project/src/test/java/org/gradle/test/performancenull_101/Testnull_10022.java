package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10022 {
    private final Productionnull_10022 production = new Productionnull_10022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}