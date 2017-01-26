package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_159 {
    private final Production36_159 production = new Production36_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}