package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_191 {
    private final Production16_191 production = new Production16_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}