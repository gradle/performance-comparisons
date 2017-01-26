package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_276 {
    private final Production77_276 production = new Production77_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}