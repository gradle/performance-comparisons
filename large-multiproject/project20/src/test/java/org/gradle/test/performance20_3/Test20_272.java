package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_272 {
    private final Production20_272 production = new Production20_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}