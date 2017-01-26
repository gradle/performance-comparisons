package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_188 {
    private final Production48_188 production = new Production48_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}