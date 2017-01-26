package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_317 {
    private final Production80_317 production = new Production80_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}