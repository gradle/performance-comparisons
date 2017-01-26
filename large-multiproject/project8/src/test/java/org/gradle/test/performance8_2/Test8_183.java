package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_183 {
    private final Production8_183 production = new Production8_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}