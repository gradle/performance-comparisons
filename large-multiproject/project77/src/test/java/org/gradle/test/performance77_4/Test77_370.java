package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_370 {
    private final Production77_370 production = new Production77_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}