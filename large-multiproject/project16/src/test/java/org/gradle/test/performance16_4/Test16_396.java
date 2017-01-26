package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_396 {
    private final Production16_396 production = new Production16_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}