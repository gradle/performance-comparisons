package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1220 {
    private final Productionnull_1220 production = new Productionnull_1220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}