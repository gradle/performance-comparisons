package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_215 {
    private final Production80_215 production = new Production80_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}