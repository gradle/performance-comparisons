package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_343 {
    private final Production16_343 production = new Production16_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}