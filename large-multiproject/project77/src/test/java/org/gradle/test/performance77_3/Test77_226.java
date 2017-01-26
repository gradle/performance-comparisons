package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_226 {
    private final Production77_226 production = new Production77_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}