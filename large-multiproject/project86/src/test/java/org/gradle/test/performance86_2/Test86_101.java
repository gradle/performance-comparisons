package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_101 {
    private final Production86_101 production = new Production86_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}