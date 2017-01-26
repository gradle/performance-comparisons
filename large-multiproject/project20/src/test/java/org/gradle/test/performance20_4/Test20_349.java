package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_349 {
    private final Production20_349 production = new Production20_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}