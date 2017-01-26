package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_156 {
    private final Production80_156 production = new Production80_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}