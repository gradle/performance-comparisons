package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_159 {
    private final Production19_159 production = new Production19_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}