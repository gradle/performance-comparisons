package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_80 {
    private final Production41_80 production = new Production41_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}