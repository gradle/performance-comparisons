package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3100 {
    private final Productionnull_3100 production = new Productionnull_3100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}