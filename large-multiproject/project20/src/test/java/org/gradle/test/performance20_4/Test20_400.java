package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_400 {
    private final Production20_400 production = new Production20_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}