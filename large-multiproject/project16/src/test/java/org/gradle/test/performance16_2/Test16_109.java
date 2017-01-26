package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_109 {
    private final Production16_109 production = new Production16_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}