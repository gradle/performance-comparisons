package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_463 {
    private final Production77_463 production = new Production77_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}