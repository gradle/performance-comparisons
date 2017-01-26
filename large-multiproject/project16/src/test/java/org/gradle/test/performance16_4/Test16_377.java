package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_377 {
    private final Production16_377 production = new Production16_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}