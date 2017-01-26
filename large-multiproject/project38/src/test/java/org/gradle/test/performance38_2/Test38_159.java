package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_159 {
    private final Production38_159 production = new Production38_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}