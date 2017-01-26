package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_444 {
    private final Production48_444 production = new Production48_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}