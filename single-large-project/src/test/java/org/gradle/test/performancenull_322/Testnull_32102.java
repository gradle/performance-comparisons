package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32102 {
    private final Productionnull_32102 production = new Productionnull_32102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}