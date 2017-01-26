package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_198 {
    private final Production27_198 production = new Production27_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}