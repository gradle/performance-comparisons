package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_500 {
    private final Production48_500 production = new Production48_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}