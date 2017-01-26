package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_348 {
    private final Production86_348 production = new Production86_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}