package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_384 {
    private final Production27_384 production = new Production27_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}