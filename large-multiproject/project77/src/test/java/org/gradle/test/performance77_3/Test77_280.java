package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_280 {
    private final Production77_280 production = new Production77_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}