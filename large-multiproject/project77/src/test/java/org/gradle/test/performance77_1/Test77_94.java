package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_94 {
    private final Production77_94 production = new Production77_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}