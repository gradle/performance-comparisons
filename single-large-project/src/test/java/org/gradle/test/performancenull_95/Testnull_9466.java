package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9466 {
    private final Productionnull_9466 production = new Productionnull_9466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}