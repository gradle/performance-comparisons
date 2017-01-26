package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_108 {
    private final Production77_108 production = new Production77_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}