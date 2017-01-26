package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36968 {
    private final Productionnull_36968 production = new Productionnull_36968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}