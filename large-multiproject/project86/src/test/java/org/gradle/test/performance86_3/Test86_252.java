package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_252 {
    private final Production86_252 production = new Production86_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}