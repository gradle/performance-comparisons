package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_258 {
    private final Production80_258 production = new Production80_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}