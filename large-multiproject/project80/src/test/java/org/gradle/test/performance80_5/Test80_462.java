package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_462 {
    private final Production80_462 production = new Production80_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}