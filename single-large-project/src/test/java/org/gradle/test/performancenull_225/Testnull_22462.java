package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22462 {
    private final Productionnull_22462 production = new Productionnull_22462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}