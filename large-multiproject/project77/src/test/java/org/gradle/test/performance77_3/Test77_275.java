package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_275 {
    private final Production77_275 production = new Production77_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}