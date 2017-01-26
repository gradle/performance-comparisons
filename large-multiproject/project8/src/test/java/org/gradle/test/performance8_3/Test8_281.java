package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_281 {
    private final Production8_281 production = new Production8_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}