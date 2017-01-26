package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_150 {
    private final Production80_150 production = new Production80_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}