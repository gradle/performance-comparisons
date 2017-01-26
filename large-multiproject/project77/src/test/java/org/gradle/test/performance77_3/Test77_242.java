package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_242 {
    private final Production77_242 production = new Production77_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}