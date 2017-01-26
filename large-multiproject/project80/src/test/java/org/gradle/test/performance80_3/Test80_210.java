package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_210 {
    private final Production80_210 production = new Production80_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}