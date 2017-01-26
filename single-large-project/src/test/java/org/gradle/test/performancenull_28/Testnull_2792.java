package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2792 {
    private final Productionnull_2792 production = new Productionnull_2792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}