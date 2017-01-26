package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2103 {
    private final Productionnull_2103 production = new Productionnull_2103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}