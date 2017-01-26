package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_488 {
    private final Production16_488 production = new Production16_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}