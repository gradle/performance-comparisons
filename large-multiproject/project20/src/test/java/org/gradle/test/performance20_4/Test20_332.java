package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_332 {
    private final Production20_332 production = new Production20_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}