package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47470 {
    private final Productionnull_47470 production = new Productionnull_47470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}