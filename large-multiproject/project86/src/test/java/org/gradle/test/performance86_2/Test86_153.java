package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_153 {
    private final Production86_153 production = new Production86_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}