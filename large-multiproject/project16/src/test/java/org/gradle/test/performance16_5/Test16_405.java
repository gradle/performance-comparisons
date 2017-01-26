package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_405 {
    private final Production16_405 production = new Production16_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}