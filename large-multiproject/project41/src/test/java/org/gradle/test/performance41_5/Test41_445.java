package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_445 {
    private final Production41_445 production = new Production41_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}