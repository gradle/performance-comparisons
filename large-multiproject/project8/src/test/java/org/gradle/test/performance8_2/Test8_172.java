package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_172 {
    private final Production8_172 production = new Production8_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}