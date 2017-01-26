package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6270 {
    private final Productionnull_6270 production = new Productionnull_6270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}