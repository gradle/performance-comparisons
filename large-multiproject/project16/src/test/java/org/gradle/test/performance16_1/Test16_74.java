package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_74 {
    private final Production16_74 production = new Production16_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}