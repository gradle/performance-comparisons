package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_401 {
    private final Production77_401 production = new Production77_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}