package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_24 {
    private final Production77_24 production = new Production77_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}