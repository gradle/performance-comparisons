package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_154 {
    private final Production77_154 production = new Production77_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}