package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7432 {
    private final Productionnull_7432 production = new Productionnull_7432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}