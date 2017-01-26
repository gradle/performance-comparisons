package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23147 {
    private final Productionnull_23147 production = new Productionnull_23147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}