package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_62 {
    private final Production8_62 production = new Production8_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}