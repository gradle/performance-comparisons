package org.gradle.test.performancenull_358;

import static org.junit.Assert.*;

public class Testnull_35781 {
    private final Productionnull_35781 production = new Productionnull_35781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}