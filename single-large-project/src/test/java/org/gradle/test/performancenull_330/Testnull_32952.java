package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32952 {
    private final Productionnull_32952 production = new Productionnull_32952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}