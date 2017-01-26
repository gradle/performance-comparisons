package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_18 {
    private final Production77_18 production = new Production77_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}