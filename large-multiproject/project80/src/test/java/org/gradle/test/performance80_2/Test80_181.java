package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_181 {
    private final Production80_181 production = new Production80_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}