package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42872 {
    private final Productionnull_42872 production = new Productionnull_42872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}