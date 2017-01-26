package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_440 {
    private final Production77_440 production = new Production77_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}