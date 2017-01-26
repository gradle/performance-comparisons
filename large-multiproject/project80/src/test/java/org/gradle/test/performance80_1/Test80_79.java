package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_79 {
    private final Production80_79 production = new Production80_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}