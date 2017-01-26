package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_475 {
    private final Productionnull_475 production = new Productionnull_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}