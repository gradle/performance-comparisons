package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_401 {
    private final Production80_401 production = new Production80_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}