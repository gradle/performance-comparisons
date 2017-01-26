package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_338 {
    private final Production8_338 production = new Production8_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}