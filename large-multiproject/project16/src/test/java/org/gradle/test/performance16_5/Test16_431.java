package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_431 {
    private final Production16_431 production = new Production16_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}