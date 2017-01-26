package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_16 {
    private final Production77_16 production = new Production77_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}