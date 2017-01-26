package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_471 {
    private final Production16_471 production = new Production16_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}