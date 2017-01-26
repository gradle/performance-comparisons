package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_432 {
    private final Production48_432 production = new Production48_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}