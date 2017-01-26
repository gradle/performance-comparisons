package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_323 {
    private final Production8_323 production = new Production8_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}