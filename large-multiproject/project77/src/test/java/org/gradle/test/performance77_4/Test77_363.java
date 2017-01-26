package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_363 {
    private final Production77_363 production = new Production77_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}