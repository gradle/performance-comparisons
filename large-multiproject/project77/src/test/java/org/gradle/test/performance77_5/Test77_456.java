package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_456 {
    private final Production77_456 production = new Production77_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}