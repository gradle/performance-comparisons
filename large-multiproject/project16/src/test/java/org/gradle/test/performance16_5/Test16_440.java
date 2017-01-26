package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_440 {
    private final Production16_440 production = new Production16_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}