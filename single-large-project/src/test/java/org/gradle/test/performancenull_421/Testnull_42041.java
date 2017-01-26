package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42041 {
    private final Productionnull_42041 production = new Productionnull_42041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}