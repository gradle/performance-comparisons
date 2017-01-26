package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_84 {
    private final Production16_84 production = new Production16_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}