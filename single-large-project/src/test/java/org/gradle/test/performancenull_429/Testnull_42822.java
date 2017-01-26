package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42822 {
    private final Productionnull_42822 production = new Productionnull_42822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}