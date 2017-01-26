package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_407 {
    private final Production77_407 production = new Production77_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}