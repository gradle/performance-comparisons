package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_244 {
    private final Production16_244 production = new Production16_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}