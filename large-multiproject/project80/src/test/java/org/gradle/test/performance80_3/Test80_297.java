package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_297 {
    private final Production80_297 production = new Production80_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}