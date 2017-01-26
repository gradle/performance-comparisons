package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_360 {
    private final Production77_360 production = new Production77_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}