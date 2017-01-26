package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3779 {
    private final Productionnull_3779 production = new Productionnull_3779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}