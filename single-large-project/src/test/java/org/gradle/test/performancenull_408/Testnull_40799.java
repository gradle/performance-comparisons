package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40799 {
    private final Productionnull_40799 production = new Productionnull_40799("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}