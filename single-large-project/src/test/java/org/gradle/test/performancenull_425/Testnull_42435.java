package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42435 {
    private final Productionnull_42435 production = new Productionnull_42435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}