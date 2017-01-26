package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30147 {
    private final Productionnull_30147 production = new Productionnull_30147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}