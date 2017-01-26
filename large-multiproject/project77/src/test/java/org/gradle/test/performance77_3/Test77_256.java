package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_256 {
    private final Production77_256 production = new Production77_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}