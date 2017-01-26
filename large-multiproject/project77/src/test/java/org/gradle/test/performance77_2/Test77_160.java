package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_160 {
    private final Production77_160 production = new Production77_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}