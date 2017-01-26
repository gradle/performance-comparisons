package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_288 {
    private final Production8_288 production = new Production8_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}