package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_232 {
    private final Production77_232 production = new Production77_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}