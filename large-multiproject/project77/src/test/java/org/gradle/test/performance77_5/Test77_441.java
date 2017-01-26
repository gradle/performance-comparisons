package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_441 {
    private final Production77_441 production = new Production77_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}