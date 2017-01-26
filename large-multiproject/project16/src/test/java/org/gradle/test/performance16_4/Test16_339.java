package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_339 {
    private final Production16_339 production = new Production16_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}