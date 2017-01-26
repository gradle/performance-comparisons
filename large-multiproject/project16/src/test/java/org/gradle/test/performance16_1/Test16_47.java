package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_47 {
    private final Production16_47 production = new Production16_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}