package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_377 {
    private final Production77_377 production = new Production77_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}