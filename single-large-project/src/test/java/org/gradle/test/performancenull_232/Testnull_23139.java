package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23139 {
    private final Productionnull_23139 production = new Productionnull_23139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}