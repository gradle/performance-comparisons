package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_120 {
    private final Production77_120 production = new Production77_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}