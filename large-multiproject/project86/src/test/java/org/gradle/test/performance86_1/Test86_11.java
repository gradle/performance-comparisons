package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_11 {
    private final Production86_11 production = new Production86_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}