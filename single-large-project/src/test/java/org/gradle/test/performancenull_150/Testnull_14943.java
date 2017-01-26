package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14943 {
    private final Productionnull_14943 production = new Productionnull_14943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}