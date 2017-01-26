package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_221 {
    private final Production77_221 production = new Production77_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}