package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_159 {
    private final Production30_159 production = new Production30_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}