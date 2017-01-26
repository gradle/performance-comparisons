package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_210 {
    private final Production16_210 production = new Production16_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}