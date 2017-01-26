package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_498 {
    private final Production8_498 production = new Production8_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}