package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_113 {
    private final Production77_113 production = new Production77_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}