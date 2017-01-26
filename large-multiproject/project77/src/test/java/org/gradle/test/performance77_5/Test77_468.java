package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_468 {
    private final Production77_468 production = new Production77_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}