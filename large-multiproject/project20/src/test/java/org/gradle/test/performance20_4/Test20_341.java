package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_341 {
    private final Production20_341 production = new Production20_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}