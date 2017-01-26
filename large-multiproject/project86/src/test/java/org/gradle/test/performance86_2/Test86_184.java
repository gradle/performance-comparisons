package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_184 {
    private final Production86_184 production = new Production86_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}