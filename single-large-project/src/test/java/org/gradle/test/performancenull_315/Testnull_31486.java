package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31486 {
    private final Productionnull_31486 production = new Productionnull_31486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}