package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_309 {
    private final Production16_309 production = new Production16_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}