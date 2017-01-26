package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_377 {
    private final Production86_377 production = new Production86_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}