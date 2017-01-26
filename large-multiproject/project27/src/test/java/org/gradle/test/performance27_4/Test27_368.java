package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_368 {
    private final Production27_368 production = new Production27_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}