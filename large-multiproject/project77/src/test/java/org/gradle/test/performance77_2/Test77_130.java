package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_130 {
    private final Production77_130 production = new Production77_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}