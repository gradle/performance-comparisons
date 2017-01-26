package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_159 {
    private final Production3_159 production = new Production3_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}