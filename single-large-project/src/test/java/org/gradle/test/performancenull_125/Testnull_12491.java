package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12491 {
    private final Productionnull_12491 production = new Productionnull_12491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}