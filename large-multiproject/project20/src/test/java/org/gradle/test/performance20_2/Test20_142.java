package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_142 {
    private final Production20_142 production = new Production20_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}