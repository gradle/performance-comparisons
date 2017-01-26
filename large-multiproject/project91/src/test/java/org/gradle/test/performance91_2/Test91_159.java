package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_159 {
    private final Production91_159 production = new Production91_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}