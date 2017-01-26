package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1875 {
    private final Productionnull_1875 production = new Productionnull_1875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}