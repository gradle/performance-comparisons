package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40782 {
    private final Productionnull_40782 production = new Productionnull_40782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}