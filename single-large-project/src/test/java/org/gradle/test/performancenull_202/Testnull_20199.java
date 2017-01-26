package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20199 {
    private final Productionnull_20199 production = new Productionnull_20199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}