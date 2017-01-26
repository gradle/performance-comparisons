package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_267 {
    private final Production8_267 production = new Production8_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}