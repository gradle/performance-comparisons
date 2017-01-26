package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2683 {
    private final Productionnull_2683 production = new Productionnull_2683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}