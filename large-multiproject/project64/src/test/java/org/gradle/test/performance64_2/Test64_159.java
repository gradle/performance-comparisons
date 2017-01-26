package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_159 {
    private final Production64_159 production = new Production64_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}