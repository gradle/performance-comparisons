package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_343 {
    private final Production77_343 production = new Production77_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}