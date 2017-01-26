package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_283 {
    private final Production77_283 production = new Production77_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}