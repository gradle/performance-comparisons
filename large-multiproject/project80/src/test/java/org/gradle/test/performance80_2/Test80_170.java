package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_170 {
    private final Production80_170 production = new Production80_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}