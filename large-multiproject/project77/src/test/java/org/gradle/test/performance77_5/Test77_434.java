package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_434 {
    private final Production77_434 production = new Production77_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}