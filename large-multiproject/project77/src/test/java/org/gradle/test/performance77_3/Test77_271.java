package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_271 {
    private final Production77_271 production = new Production77_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}