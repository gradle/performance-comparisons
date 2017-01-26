package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2962 {
    private final Productionnull_2962 production = new Productionnull_2962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}