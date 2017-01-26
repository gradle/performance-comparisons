package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2041 {
    private final Productionnull_2041 production = new Productionnull_2041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}