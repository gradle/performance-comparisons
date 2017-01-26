package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_427 {
    private final Production8_427 production = new Production8_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}