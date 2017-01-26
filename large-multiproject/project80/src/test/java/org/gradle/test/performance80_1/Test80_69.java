package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_69 {
    private final Production80_69 production = new Production80_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}