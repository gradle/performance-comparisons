package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37260 {
    private final Productionnull_37260 production = new Productionnull_37260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}