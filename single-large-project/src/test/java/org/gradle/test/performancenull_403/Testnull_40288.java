package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40288 {
    private final Productionnull_40288 production = new Productionnull_40288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}