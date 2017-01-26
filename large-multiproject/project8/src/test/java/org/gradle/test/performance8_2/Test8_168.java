package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_168 {
    private final Production8_168 production = new Production8_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}