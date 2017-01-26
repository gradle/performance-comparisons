package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42886 {
    private final Productionnull_42886 production = new Productionnull_42886("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}