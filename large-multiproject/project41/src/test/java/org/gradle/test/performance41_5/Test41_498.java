package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_498 {
    private final Production41_498 production = new Production41_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}