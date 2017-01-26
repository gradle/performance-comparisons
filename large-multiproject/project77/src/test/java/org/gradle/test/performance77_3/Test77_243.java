package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_243 {
    private final Production77_243 production = new Production77_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}