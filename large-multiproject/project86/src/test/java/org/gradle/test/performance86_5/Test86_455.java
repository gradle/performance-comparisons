package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_455 {
    private final Production86_455 production = new Production86_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}