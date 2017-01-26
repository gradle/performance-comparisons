package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42496 {
    private final Productionnull_42496 production = new Productionnull_42496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}