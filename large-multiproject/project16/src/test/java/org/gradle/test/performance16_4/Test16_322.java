package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_322 {
    private final Production16_322 production = new Production16_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}