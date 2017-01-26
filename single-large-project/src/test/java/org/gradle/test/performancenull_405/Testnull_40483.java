package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40483 {
    private final Productionnull_40483 production = new Productionnull_40483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}