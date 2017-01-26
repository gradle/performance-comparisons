package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_333 {
    private final Production86_333 production = new Production86_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}