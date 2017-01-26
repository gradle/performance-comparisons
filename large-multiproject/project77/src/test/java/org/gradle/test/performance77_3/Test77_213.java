package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_213 {
    private final Production77_213 production = new Production77_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}