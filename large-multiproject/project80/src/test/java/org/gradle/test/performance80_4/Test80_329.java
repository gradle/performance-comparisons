package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_329 {
    private final Production80_329 production = new Production80_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}