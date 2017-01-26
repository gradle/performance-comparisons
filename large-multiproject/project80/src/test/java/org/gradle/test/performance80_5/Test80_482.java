package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_482 {
    private final Production80_482 production = new Production80_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}