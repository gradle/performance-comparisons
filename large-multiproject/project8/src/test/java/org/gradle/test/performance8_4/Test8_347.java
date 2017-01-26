package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_347 {
    private final Production8_347 production = new Production8_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}