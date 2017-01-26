package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_105 {
    private final Production20_105 production = new Production20_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}