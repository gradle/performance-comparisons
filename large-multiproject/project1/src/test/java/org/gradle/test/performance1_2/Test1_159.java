package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_159 {
    private final Production1_159 production = new Production1_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}