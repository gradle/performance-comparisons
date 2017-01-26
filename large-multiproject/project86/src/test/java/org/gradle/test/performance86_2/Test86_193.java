package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_193 {
    private final Production86_193 production = new Production86_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}