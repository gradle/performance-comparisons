package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_489 {
    private final Production77_489 production = new Production77_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}