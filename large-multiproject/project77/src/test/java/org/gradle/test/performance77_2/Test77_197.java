package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_197 {
    private final Production77_197 production = new Production77_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}