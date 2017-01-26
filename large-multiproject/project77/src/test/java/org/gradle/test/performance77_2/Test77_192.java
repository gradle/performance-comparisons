package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_192 {
    private final Production77_192 production = new Production77_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}