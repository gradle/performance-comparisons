package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_220 {
    private final Production80_220 production = new Production80_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}