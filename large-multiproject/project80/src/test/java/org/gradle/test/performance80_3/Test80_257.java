package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_257 {
    private final Production80_257 production = new Production80_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}