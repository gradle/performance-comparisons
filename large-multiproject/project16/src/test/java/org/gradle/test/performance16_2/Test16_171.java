package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_171 {
    private final Production16_171 production = new Production16_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}