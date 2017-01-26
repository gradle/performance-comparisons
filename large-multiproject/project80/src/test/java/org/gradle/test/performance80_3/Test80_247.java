package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_247 {
    private final Production80_247 production = new Production80_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}