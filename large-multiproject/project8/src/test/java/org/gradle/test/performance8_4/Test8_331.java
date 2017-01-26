package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_331 {
    private final Production8_331 production = new Production8_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}