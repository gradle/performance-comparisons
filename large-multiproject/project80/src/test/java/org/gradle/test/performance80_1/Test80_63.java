package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_63 {
    private final Production80_63 production = new Production80_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}