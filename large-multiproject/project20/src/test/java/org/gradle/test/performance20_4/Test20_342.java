package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_342 {
    private final Production20_342 production = new Production20_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}