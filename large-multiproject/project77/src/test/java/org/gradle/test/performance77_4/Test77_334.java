package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_334 {
    private final Production77_334 production = new Production77_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}