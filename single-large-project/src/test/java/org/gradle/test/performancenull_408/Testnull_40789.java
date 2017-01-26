package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40789 {
    private final Productionnull_40789 production = new Productionnull_40789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}