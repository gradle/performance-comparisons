package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_477 {
    private final Production16_477 production = new Production16_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}