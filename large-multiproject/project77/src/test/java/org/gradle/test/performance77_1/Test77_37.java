package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_37 {
    private final Production77_37 production = new Production77_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}