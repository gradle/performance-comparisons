package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_316 {
    private final Production27_316 production = new Production27_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}