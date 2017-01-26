package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47242 {
    private final Productionnull_47242 production = new Productionnull_47242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}