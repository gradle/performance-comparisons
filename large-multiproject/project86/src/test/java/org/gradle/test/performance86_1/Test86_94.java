package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_94 {
    private final Production86_94 production = new Production86_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}