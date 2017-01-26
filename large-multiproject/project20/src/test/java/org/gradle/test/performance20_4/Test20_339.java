package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_339 {
    private final Production20_339 production = new Production20_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}