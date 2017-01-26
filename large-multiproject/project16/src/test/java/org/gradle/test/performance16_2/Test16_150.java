package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_150 {
    private final Production16_150 production = new Production16_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}