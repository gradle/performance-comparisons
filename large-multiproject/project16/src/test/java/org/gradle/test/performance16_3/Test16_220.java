package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_220 {
    private final Production16_220 production = new Production16_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}