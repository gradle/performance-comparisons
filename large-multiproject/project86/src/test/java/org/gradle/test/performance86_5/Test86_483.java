package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_483 {
    private final Production86_483 production = new Production86_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}