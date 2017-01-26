package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_73 {
    private final Production8_73 production = new Production8_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}