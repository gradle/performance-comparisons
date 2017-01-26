package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_256 {
    private final Production86_256 production = new Production86_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}