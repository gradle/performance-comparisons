package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_331 {
    private final Production41_331 production = new Production41_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}