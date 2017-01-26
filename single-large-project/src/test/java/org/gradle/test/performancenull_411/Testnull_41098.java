package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41098 {
    private final Productionnull_41098 production = new Productionnull_41098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}