package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_223 {
    private final Production27_223 production = new Production27_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}