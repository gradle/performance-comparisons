package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_225 {
    private final Production8_225 production = new Production8_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}