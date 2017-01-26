package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_322 {
    private final Production80_322 production = new Production80_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}