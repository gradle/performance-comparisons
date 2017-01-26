package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_218 {
    private final Production77_218 production = new Production77_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}