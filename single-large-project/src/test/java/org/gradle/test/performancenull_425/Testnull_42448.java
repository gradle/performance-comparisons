package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42448 {
    private final Productionnull_42448 production = new Productionnull_42448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}