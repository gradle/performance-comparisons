package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_441 {
    private final Production86_441 production = new Production86_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}