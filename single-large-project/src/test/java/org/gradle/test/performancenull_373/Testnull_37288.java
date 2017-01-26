package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37288 {
    private final Productionnull_37288 production = new Productionnull_37288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}