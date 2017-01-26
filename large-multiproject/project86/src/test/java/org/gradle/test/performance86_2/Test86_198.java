package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_198 {
    private final Production86_198 production = new Production86_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}