package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_164 {
    private final Production77_164 production = new Production77_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}