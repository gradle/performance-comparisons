package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_24 {
    private final Production20_24 production = new Production20_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}