package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_16 {
    private final Production80_16 production = new Production80_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}