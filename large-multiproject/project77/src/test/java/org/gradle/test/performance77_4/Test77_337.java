package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_337 {
    private final Production77_337 production = new Production77_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}