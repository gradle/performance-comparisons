package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_122 {
    private final Production77_122 production = new Production77_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}