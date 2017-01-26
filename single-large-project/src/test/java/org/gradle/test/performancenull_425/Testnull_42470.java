package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42470 {
    private final Productionnull_42470 production = new Productionnull_42470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}