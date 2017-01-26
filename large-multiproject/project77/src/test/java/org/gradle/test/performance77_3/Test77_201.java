package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_201 {
    private final Production77_201 production = new Production77_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}