package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_294 {
    private final Production41_294 production = new Production41_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}