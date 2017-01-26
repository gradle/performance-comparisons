package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_159 {
    private final Production90_159 production = new Production90_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}