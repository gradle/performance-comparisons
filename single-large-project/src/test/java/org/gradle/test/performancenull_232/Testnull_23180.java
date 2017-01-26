package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23180 {
    private final Productionnull_23180 production = new Productionnull_23180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}