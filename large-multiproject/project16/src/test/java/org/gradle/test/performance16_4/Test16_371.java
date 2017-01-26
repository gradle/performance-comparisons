package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_371 {
    private final Production16_371 production = new Production16_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}