package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33085 {
    private final Productionnull_33085 production = new Productionnull_33085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}