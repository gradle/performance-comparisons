package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_217 {
    private final Production16_217 production = new Production16_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}