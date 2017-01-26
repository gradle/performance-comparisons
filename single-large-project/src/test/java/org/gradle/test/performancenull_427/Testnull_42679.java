package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42679 {
    private final Productionnull_42679 production = new Productionnull_42679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}