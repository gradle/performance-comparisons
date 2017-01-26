package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_457 {
    private final Production80_457 production = new Production80_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}