package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_237 {
    private final Production77_237 production = new Production77_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}