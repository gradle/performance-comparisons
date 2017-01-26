package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_459 {
    private final Production77_459 production = new Production77_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}