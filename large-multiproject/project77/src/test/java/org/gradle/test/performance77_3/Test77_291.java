package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_291 {
    private final Production77_291 production = new Production77_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}