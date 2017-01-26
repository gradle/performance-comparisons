package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49997 {
    private final Productionnull_49997 production = new Productionnull_49997("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}