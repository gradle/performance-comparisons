package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_293 {
    private final Production8_293 production = new Production8_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}