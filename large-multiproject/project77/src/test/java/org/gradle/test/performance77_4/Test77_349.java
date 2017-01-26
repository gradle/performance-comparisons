package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_349 {
    private final Production77_349 production = new Production77_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}