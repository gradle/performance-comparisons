package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_260 {
    private final Production48_260 production = new Production48_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}