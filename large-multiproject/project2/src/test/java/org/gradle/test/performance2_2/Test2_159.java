package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_159 {
    private final Production2_159 production = new Production2_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}