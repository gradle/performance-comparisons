package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_261 {
    private final Production77_261 production = new Production77_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}