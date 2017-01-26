package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_253 {
    private final Production16_253 production = new Production16_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}