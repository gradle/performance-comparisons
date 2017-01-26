package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_268 {
    private final Production8_268 production = new Production8_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}