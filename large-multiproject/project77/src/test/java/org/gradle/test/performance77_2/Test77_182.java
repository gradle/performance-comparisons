package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_182 {
    private final Production77_182 production = new Production77_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}