package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_306 {
    private final Production80_306 production = new Production80_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}