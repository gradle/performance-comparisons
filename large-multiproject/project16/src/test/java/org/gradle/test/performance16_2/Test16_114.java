package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_114 {
    private final Production16_114 production = new Production16_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}