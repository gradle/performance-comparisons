package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_137 {
    private final Production77_137 production = new Production77_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}