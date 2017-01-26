package org.gradle.test.performancenull_278;

import static org.junit.Assert.*;

public class Testnull_27785 {
    private final Productionnull_27785 production = new Productionnull_27785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}