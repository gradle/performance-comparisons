package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_143 {
    private final Production16_143 production = new Production16_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}