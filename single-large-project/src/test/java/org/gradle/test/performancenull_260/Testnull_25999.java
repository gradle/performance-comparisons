package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25999 {
    private final Productionnull_25999 production = new Productionnull_25999("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}