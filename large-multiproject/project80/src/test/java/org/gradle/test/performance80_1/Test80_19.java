package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_19 {
    private final Production80_19 production = new Production80_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}