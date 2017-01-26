package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37217 {
    private final Productionnull_37217 production = new Productionnull_37217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}