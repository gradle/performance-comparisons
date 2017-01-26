package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_74 {
    private final Production8_74 production = new Production8_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}