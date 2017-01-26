package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_318 {
    private final Production77_318 production = new Production77_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}