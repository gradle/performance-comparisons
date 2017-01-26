package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_474 {
    private final Production16_474 production = new Production16_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}