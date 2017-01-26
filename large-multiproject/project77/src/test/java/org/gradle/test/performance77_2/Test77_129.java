package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_129 {
    private final Production77_129 production = new Production77_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}