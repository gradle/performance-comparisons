package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_482 {
    private final Production77_482 production = new Production77_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}