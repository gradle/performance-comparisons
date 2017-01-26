package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_466 {
    private final Production77_466 production = new Production77_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}