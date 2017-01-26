package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_93 {
    private final Production8_93 production = new Production8_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}