package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_46 {
    private final Production80_46 production = new Production80_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}