package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_278 {
    private final Production86_278 production = new Production86_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}