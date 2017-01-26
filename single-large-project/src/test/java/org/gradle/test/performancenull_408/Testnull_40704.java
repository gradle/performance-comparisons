package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40704 {
    private final Productionnull_40704 production = new Productionnull_40704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}