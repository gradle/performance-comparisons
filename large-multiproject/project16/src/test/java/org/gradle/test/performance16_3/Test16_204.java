package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_204 {
    private final Production16_204 production = new Production16_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}