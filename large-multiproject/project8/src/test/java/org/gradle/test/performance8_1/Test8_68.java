package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_68 {
    private final Production8_68 production = new Production8_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}