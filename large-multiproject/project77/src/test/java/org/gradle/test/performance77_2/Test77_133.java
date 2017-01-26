package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_133 {
    private final Production77_133 production = new Production77_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}