package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_311 {
    private final Production77_311 production = new Production77_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}