package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_107 {
    private final Production8_107 production = new Production8_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}