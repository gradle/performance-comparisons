package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30418 {
    private final Productionnull_30418 production = new Productionnull_30418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}