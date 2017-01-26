package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18109 {
    private final Productionnull_18109 production = new Productionnull_18109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}