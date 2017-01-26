package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_423 {
    private final Production86_423 production = new Production86_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}