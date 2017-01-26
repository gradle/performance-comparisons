package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_142 {
    private final Production77_142 production = new Production77_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}