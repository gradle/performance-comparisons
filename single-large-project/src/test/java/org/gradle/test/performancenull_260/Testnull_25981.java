package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25981 {
    private final Productionnull_25981 production = new Productionnull_25981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}