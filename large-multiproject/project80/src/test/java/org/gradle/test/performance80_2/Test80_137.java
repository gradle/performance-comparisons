package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_137 {
    private final Production80_137 production = new Production80_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}