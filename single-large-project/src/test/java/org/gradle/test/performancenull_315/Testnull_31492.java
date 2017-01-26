package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31492 {
    private final Productionnull_31492 production = new Productionnull_31492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}