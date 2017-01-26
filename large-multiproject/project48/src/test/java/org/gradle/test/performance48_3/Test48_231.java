package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_231 {
    private final Production48_231 production = new Production48_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}