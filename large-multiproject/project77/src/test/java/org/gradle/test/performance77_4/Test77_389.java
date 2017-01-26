package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_389 {
    private final Production77_389 production = new Production77_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}