package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_193 {
    private final Production16_193 production = new Production16_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}