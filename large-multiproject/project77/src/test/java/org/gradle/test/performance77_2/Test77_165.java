package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_165 {
    private final Production77_165 production = new Production77_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}