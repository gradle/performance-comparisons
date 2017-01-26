package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_22 {
    private final Production77_22 production = new Production77_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}