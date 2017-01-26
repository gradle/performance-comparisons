package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_148 {
    private final Production86_148 production = new Production86_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}