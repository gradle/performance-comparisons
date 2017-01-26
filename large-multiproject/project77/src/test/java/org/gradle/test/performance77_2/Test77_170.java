package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_170 {
    private final Production77_170 production = new Production77_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}