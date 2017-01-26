package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_176 {
    private final Production80_176 production = new Production80_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}