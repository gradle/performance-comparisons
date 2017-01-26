package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_6 {
    private final Production77_6 production = new Production77_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}