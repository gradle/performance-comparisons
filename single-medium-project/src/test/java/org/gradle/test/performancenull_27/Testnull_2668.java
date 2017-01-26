package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2668 {
    private final Productionnull_2668 production = new Productionnull_2668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}