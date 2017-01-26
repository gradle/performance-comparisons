package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_83 {
    private final Production77_83 production = new Production77_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}