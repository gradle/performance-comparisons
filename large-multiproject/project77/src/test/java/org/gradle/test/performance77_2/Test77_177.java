package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_177 {
    private final Production77_177 production = new Production77_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}