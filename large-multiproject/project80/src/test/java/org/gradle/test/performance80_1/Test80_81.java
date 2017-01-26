package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_81 {
    private final Production80_81 production = new Production80_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}