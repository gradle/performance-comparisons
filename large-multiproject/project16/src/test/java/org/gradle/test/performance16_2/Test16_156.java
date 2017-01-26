package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_156 {
    private final Production16_156 production = new Production16_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}