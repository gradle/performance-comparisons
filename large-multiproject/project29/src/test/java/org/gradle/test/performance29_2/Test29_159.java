package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_159 {
    private final Production29_159 production = new Production29_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}