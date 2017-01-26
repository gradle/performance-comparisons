package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_166 {
    private final Production8_166 production = new Production8_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}