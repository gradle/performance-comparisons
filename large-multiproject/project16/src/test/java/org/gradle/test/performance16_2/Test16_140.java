package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_140 {
    private final Production16_140 production = new Production16_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}