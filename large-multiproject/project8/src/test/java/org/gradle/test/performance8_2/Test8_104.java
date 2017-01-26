package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_104 {
    private final Production8_104 production = new Production8_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}