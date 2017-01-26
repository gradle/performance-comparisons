package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_159 {
    private final Production87_159 production = new Production87_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}