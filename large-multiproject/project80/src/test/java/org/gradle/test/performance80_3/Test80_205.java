package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_205 {
    private final Production80_205 production = new Production80_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}