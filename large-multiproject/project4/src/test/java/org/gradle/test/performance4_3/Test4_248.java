package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_248 {
    private final Production4_248 production = new Production4_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}