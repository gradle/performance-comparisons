package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5053 {
    private final Productionnull_5053 production = new Productionnull_5053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}