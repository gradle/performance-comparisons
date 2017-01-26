package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_350 {
    private final Production8_350 production = new Production8_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}