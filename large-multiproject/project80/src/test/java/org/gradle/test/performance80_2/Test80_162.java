package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_162 {
    private final Production80_162 production = new Production80_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}