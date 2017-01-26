package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_25 {
    private final Production16_25 production = new Production16_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}