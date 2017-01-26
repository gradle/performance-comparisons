package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_436 {
    private final Production77_436 production = new Production77_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}