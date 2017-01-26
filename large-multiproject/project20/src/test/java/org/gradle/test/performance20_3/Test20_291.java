package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_291 {
    private final Production20_291 production = new Production20_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}