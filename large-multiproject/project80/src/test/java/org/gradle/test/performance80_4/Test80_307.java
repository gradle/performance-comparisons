package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_307 {
    private final Production80_307 production = new Production80_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}