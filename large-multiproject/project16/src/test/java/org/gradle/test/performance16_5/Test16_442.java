package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_442 {
    private final Production16_442 production = new Production16_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}