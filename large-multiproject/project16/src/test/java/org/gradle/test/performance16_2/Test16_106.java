package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_106 {
    private final Production16_106 production = new Production16_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}