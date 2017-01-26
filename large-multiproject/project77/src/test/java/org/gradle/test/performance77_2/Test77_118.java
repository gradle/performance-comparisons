package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_118 {
    private final Production77_118 production = new Production77_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}