package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_59 {
    private final Production77_59 production = new Production77_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}