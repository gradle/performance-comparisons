package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49941 {
    private final Productionnull_49941 production = new Productionnull_49941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}