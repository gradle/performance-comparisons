package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17187 {
    private final Productionnull_17187 production = new Productionnull_17187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}