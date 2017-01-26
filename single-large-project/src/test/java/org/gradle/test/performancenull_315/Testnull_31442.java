package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31442 {
    private final Productionnull_31442 production = new Productionnull_31442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}