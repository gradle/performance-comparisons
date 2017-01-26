package org.gradle.test.performancenull_477;

import static org.junit.Assert.*;

public class Testnull_47681 {
    private final Productionnull_47681 production = new Productionnull_47681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}