package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_452 {
    private final Production77_452 production = new Production77_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}