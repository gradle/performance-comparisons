package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_464 {
    private final Production16_464 production = new Production16_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}