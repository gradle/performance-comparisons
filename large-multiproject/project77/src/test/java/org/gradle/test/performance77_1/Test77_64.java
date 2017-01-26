package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_64 {
    private final Production77_64 production = new Production77_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}