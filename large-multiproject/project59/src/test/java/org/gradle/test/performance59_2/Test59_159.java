package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_159 {
    private final Production59_159 production = new Production59_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}