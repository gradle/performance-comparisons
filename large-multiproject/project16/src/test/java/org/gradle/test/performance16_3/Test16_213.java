package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_213 {
    private final Production16_213 production = new Production16_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}