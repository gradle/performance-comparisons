package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_387 {
    private final Production77_387 production = new Production77_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}