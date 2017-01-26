package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_121 {
    private final Production86_121 production = new Production86_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}