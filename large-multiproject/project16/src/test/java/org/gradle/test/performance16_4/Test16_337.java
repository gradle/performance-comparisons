package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_337 {
    private final Production16_337 production = new Production16_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}