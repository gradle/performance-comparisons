package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47969 {
    private final Productionnull_47969 production = new Productionnull_47969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}