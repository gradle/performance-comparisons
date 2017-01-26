package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_272 {
    private final Production77_272 production = new Production77_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}