package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_428 {
    private final Production20_428 production = new Production20_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}