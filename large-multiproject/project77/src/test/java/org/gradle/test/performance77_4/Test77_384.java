package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_384 {
    private final Production77_384 production = new Production77_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}