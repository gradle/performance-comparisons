package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_398 {
    private final Production16_398 production = new Production16_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}