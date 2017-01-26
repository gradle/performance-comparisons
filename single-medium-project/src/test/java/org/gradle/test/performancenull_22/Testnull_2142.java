package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2142 {
    private final Productionnull_2142 production = new Productionnull_2142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}