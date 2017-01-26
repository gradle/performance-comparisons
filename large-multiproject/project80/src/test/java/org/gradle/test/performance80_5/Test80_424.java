package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_424 {
    private final Production80_424 production = new Production80_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}