package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42500 {
    private final Productionnull_42500 production = new Productionnull_42500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}