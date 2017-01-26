package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_169 {
    private final Production77_169 production = new Production77_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}