package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_421 {
    private final Production16_421 production = new Production16_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}