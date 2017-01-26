package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_286 {
    private final Production77_286 production = new Production77_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}