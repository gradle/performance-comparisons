package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_177 {
    private final Production86_177 production = new Production86_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}