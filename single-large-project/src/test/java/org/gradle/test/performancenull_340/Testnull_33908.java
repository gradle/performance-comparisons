package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33908 {
    private final Productionnull_33908 production = new Productionnull_33908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}