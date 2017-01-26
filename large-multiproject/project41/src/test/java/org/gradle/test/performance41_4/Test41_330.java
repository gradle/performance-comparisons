package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_330 {
    private final Production41_330 production = new Production41_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}