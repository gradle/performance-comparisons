package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_88 {
    private final Production8_88 production = new Production8_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}