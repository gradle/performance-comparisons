package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40594 {
    private final Productionnull_40594 production = new Productionnull_40594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}