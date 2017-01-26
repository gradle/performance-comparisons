package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_198 {
    private final Production77_198 production = new Production77_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}