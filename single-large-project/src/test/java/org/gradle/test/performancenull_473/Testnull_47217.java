package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47217 {
    private final Productionnull_47217 production = new Productionnull_47217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}