package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_419 {
    private final Production77_419 production = new Production77_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}