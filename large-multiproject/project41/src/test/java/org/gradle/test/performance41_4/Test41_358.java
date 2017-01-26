package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_358 {
    private final Production41_358 production = new Production41_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}