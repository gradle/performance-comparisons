package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_70 {
    private final Production77_70 production = new Production77_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}