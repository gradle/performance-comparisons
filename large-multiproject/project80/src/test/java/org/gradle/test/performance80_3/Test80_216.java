package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_216 {
    private final Production80_216 production = new Production80_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}