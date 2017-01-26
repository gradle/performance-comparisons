package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_400 {
    private final Production77_400 production = new Production77_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}