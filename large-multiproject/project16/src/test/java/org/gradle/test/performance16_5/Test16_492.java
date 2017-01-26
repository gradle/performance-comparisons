package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_492 {
    private final Production16_492 production = new Production16_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}