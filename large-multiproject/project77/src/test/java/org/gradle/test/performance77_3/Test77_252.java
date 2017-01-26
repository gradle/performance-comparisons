package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_252 {
    private final Production77_252 production = new Production77_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}