package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_78 {
    private final Production8_78 production = new Production8_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}