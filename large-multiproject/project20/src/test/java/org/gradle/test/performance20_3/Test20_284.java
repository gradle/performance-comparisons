package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_284 {
    private final Production20_284 production = new Production20_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}