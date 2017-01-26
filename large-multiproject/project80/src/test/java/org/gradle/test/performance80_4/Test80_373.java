package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_373 {
    private final Production80_373 production = new Production80_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}