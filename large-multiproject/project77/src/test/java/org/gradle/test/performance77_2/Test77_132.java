package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_132 {
    private final Production77_132 production = new Production77_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}