package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_133 {
    private final Production80_133 production = new Production80_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}