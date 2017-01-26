package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_41 {
    private final Production8_41 production = new Production8_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}