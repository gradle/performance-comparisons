package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_214 {
    private final Production48_214 production = new Production48_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}