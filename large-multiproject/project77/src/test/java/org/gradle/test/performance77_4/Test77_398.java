package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_398 {
    private final Production77_398 production = new Production77_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}