package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_420 {
    private final Production20_420 production = new Production20_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}