package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_352 {
    private final Production86_352 production = new Production86_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}