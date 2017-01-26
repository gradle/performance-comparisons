package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_356 {
    private final Production8_356 production = new Production8_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}