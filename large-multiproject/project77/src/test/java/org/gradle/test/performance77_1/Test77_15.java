package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_15 {
    private final Production77_15 production = new Production77_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}