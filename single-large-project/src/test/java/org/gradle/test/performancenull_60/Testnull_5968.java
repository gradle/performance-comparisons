package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5968 {
    private final Productionnull_5968 production = new Productionnull_5968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}