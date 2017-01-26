package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_258 {
    private final Production77_258 production = new Production77_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}