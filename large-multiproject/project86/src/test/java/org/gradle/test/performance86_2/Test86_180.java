package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_180 {
    private final Production86_180 production = new Production86_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}