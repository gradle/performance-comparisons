package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7470 {
    private final Productionnull_7470 production = new Productionnull_7470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}