package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_271 {
    private final Production20_271 production = new Production20_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}