package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6103 {
    private final Productionnull_6103 production = new Productionnull_6103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}