package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_95 {
    private final Production80_95 production = new Production80_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}