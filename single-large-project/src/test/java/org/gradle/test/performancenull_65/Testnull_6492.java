package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6492 {
    private final Productionnull_6492 production = new Productionnull_6492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}