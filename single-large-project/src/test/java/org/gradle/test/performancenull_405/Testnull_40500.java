package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40500 {
    private final Productionnull_40500 production = new Productionnull_40500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}