package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_247 {
    private final Production77_247 production = new Production77_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}