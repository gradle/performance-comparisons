package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24180 {
    private final Productionnull_24180 production = new Productionnull_24180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}