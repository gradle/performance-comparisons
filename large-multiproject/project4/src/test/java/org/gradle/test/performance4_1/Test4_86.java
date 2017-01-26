package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_86 {
    private final Production4_86 production = new Production4_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}