package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_154 {
    private final Production16_154 production = new Production16_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}