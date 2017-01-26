package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_90 {
    private final Production77_90 production = new Production77_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}