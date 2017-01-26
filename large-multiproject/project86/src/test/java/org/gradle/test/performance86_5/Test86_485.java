package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_485 {
    private final Production86_485 production = new Production86_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}