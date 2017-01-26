package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_200 {
    private final Production8_200 production = new Production8_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}