package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_222 {
    private final Production80_222 production = new Production80_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}