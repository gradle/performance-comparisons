package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_159 {
    private final Production49_159 production = new Production49_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}