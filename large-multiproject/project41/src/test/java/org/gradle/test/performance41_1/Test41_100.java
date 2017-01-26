package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_100 {
    private final Production41_100 production = new Production41_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}