package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_462 {
    private final Production77_462 production = new Production77_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}