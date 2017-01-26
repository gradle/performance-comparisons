package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_120 {
    private final Production20_120 production = new Production20_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}