package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_86 {
    private final Production77_86 production = new Production77_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}