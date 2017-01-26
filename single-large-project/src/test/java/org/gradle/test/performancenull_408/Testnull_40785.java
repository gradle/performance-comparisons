package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40785 {
    private final Productionnull_40785 production = new Productionnull_40785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}