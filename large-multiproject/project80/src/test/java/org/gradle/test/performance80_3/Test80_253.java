package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_253 {
    private final Production80_253 production = new Production80_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}