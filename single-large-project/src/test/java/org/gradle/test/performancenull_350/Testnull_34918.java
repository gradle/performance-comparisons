package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34918 {
    private final Productionnull_34918 production = new Productionnull_34918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}