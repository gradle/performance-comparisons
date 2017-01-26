package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_206 {
    private final Production77_206 production = new Production77_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}