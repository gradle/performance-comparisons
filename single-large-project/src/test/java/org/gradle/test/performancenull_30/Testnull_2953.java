package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2953 {
    private final Productionnull_2953 production = new Productionnull_2953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}