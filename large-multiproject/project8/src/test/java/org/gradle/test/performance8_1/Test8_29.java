package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_29 {
    private final Production8_29 production = new Production8_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}