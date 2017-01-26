package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_183 {
    private final Production48_183 production = new Production48_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}