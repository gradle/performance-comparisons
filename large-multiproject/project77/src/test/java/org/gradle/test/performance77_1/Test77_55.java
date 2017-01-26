package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_55 {
    private final Production77_55 production = new Production77_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}