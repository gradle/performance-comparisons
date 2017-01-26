package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_4 {
    private final Production77_4 production = new Production77_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}