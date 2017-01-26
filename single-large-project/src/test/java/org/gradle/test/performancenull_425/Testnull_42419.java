package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42419 {
    private final Productionnull_42419 production = new Productionnull_42419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}