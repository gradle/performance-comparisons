package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14902 {
    private final Productionnull_14902 production = new Productionnull_14902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}