package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_290 {
    private final Production77_290 production = new Production77_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}