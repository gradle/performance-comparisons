package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49785 {
    private final Productionnull_49785 production = new Productionnull_49785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}