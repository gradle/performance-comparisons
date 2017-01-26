package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_231 {
    private final Production77_231 production = new Production77_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}