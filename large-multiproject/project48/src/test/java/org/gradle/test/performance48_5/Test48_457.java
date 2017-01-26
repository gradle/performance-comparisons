package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_457 {
    private final Production48_457 production = new Production48_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}