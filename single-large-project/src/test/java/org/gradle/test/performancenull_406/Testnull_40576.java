package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40576 {
    private final Productionnull_40576 production = new Productionnull_40576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}