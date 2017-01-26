package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19099 {
    private final Productionnull_19099 production = new Productionnull_19099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}