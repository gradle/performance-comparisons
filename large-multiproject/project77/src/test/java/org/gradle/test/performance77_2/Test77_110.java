package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_110 {
    private final Production77_110 production = new Production77_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}