package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_37 {
    private final Production80_37 production = new Production80_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}