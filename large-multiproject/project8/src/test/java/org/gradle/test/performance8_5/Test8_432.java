package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_432 {
    private final Production8_432 production = new Production8_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}