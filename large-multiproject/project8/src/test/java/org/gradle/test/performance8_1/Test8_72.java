package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_72 {
    private final Production8_72 production = new Production8_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}