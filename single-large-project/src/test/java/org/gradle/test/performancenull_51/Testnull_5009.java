package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5009 {
    private final Productionnull_5009 production = new Productionnull_5009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}