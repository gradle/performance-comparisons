package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_179 {
    private final Production77_179 production = new Production77_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}