package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_44 {
    private final Production8_44 production = new Production8_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}