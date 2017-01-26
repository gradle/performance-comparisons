package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_301 {
    private final Production77_301 production = new Production77_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}