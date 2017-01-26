package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42475 {
    private final Productionnull_42475 production = new Productionnull_42475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}