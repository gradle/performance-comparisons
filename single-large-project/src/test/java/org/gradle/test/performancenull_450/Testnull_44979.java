package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44979 {
    private final Productionnull_44979 production = new Productionnull_44979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}