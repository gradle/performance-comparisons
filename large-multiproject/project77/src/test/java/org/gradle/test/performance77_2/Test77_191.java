package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_191 {
    private final Production77_191 production = new Production77_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}