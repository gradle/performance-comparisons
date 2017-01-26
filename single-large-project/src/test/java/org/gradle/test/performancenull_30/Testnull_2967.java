package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2967 {
    private final Productionnull_2967 production = new Productionnull_2967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}