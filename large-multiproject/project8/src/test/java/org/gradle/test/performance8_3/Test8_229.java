package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_229 {
    private final Production8_229 production = new Production8_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}