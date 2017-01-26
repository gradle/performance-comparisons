package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_304 {
    private final Production80_304 production = new Production80_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}