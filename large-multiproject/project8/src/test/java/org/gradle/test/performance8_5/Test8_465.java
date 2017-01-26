package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_465 {
    private final Production8_465 production = new Production8_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}