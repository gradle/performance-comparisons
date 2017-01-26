package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_40 {
    private final Production41_40 production = new Production41_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}