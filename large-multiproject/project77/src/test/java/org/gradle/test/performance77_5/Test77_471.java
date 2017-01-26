package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_471 {
    private final Production77_471 production = new Production77_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}