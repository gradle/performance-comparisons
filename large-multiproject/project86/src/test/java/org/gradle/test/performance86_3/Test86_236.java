package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_236 {
    private final Production86_236 production = new Production86_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}