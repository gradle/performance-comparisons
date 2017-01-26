package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_317 {
    private final Production16_317 production = new Production16_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}