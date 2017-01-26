package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_184 {
    private final Production77_184 production = new Production77_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}