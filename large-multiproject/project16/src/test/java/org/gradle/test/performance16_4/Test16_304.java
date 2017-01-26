package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_304 {
    private final Production16_304 production = new Production16_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}