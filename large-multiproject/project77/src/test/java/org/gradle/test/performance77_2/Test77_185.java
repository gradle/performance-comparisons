package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_185 {
    private final Production77_185 production = new Production77_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}