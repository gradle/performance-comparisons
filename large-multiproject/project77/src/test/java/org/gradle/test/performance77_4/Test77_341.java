package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_341 {
    private final Production77_341 production = new Production77_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}