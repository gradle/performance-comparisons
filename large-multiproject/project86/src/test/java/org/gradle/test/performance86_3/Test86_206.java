package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_206 {
    private final Production86_206 production = new Production86_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}