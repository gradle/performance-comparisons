package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_276 {
    private final Production20_276 production = new Production20_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}