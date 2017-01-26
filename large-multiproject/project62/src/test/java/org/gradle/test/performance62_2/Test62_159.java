package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_159 {
    private final Production62_159 production = new Production62_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}