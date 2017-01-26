package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_157 {
    private final Production8_157 production = new Production8_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}