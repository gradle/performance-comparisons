package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_332 {
    private final Production77_332 production = new Production77_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}