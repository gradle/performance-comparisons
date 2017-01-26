package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_214 {
    private final Production16_214 production = new Production16_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}