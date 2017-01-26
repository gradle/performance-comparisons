package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_97 {
    private final Production8_97 production = new Production8_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}