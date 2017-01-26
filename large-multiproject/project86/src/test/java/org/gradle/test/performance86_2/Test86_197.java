package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_197 {
    private final Production86_197 production = new Production86_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}