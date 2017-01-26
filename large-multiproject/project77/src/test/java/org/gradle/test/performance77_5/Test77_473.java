package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_473 {
    private final Production77_473 production = new Production77_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}