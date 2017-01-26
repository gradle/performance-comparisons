package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_52 {
    private final Production80_52 production = new Production80_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}