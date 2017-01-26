package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_159 {
    private final Production74_159 production = new Production74_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}