package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_436 {
    private final Production80_436 production = new Production80_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}