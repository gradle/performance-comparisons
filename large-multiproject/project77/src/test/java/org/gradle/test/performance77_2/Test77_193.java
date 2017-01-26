package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_193 {
    private final Production77_193 production = new Production77_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}