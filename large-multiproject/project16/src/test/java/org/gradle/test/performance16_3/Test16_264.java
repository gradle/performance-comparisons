package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_264 {
    private final Production16_264 production = new Production16_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}