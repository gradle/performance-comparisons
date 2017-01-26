package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_218 {
    private final Production86_218 production = new Production86_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}