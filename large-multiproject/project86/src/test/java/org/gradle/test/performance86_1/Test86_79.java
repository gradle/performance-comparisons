package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_79 {
    private final Production86_79 production = new Production86_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}