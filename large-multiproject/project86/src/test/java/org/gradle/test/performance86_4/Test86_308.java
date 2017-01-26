package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_308 {
    private final Production86_308 production = new Production86_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}