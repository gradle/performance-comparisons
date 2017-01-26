package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_180 {
    private final Production20_180 production = new Production20_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}