package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_5 {
    private final Production16_5 production = new Production16_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}