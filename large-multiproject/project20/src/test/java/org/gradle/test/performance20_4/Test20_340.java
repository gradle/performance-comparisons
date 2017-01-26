package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_340 {
    private final Production20_340 production = new Production20_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}