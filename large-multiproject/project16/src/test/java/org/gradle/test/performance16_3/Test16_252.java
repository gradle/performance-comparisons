package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_252 {
    private final Production16_252 production = new Production16_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}