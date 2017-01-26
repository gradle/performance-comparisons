package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_86 {
    private final Production92_86 production = new Production92_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}