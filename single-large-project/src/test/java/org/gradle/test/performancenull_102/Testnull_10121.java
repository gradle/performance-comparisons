package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10121 {
    private final Productionnull_10121 production = new Productionnull_10121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}