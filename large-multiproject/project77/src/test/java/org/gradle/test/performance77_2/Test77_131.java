package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_131 {
    private final Production77_131 production = new Production77_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}