package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_178 {
    private final Production77_178 production = new Production77_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}