package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_67 {
    private final Production8_67 production = new Production8_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}