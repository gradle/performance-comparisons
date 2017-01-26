package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_162 {
    private final Production16_162 production = new Production16_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}