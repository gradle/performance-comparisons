package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_118 {
    private final Production20_118 production = new Production20_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}