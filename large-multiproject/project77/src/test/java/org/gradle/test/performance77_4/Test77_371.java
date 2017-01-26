package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_371 {
    private final Production77_371 production = new Production77_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}