package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_161 {
    private final Production80_161 production = new Production80_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}