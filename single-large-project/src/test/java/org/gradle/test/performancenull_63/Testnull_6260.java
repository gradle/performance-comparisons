package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6260 {
    private final Productionnull_6260 production = new Productionnull_6260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}