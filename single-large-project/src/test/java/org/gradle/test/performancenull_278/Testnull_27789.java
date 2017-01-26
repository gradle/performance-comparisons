package org.gradle.test.performancenull_278;

import static org.junit.Assert.*;

public class Testnull_27789 {
    private final Productionnull_27789 production = new Productionnull_27789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}