package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41001 {
    private final Productionnull_41001 production = new Productionnull_41001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}