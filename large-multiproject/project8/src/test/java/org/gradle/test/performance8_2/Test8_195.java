package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_195 {
    private final Production8_195 production = new Production8_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}