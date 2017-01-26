package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_23 {
    private final Production86_23 production = new Production86_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}