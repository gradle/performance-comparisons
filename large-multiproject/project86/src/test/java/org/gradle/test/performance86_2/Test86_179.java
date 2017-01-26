package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_179 {
    private final Production86_179 production = new Production86_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}