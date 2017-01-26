package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_339 {
    private final Production77_339 production = new Production77_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}