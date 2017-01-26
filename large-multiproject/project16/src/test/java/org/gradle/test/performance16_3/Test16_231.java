package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_231 {
    private final Production16_231 production = new Production16_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}