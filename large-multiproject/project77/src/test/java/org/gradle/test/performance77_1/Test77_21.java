package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_21 {
    private final Production77_21 production = new Production77_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}