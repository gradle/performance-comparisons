package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_379 {
    private final Production80_379 production = new Production80_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}