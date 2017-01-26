package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_345 {
    private final Production77_345 production = new Production77_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}