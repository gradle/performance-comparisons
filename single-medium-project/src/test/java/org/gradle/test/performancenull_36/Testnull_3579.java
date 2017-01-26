package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3579 {
    private final Productionnull_3579 production = new Productionnull_3579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}