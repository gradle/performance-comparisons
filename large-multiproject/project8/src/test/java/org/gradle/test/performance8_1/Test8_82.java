package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_82 {
    private final Production8_82 production = new Production8_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}