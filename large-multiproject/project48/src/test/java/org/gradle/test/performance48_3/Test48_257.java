package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_257 {
    private final Production48_257 production = new Production48_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}