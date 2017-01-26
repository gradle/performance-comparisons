package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42462 {
    private final Productionnull_42462 production = new Productionnull_42462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}