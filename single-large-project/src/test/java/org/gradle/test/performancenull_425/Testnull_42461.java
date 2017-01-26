package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42461 {
    private final Productionnull_42461 production = new Productionnull_42461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}