package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_333 {
    private final Production80_333 production = new Production80_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}