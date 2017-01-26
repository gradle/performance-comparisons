package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_145 {
    private final Production8_145 production = new Production8_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}