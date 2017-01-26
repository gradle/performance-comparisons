package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_371 {
    private final Production20_371 production = new Production20_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}