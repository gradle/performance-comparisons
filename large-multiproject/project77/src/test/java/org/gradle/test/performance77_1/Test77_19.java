package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_19 {
    private final Production77_19 production = new Production77_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}