package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_349 {
    private final Production86_349 production = new Production86_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}