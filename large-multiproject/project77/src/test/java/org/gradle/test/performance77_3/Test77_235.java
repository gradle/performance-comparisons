package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_235 {
    private final Production77_235 production = new Production77_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}