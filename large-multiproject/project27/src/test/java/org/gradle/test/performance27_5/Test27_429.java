package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_429 {
    private final Production27_429 production = new Production27_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}