package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_357 {
    private final Production77_357 production = new Production77_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}