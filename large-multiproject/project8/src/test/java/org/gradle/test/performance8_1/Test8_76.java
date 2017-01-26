package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_76 {
    private final Production8_76 production = new Production8_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}