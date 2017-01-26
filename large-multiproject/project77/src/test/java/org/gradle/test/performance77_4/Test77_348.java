package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_348 {
    private final Production77_348 production = new Production77_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}