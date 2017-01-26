package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_420 {
    private final Production77_420 production = new Production77_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}