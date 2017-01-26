package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_333 {
    private final Production77_333 production = new Production77_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}