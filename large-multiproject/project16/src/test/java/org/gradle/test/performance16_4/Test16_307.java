package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_307 {
    private final Production16_307 production = new Production16_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}