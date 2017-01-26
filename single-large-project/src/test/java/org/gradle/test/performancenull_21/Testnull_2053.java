package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2053 {
    private final Productionnull_2053 production = new Productionnull_2053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}