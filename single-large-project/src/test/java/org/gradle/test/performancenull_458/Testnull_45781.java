package org.gradle.test.performancenull_458;

import static org.junit.Assert.*;

public class Testnull_45781 {
    private final Productionnull_45781 production = new Productionnull_45781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}