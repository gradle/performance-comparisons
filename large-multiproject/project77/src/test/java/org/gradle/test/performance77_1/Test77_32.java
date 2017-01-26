package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_32 {
    private final Production77_32 production = new Production77_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}