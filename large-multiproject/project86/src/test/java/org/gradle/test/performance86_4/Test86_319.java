package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_319 {
    private final Production86_319 production = new Production86_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}