package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_320 {
    private final Production41_320 production = new Production41_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}