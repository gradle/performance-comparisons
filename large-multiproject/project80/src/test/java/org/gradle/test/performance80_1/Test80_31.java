package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_31 {
    private final Production80_31 production = new Production80_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}