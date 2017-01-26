package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_384 {
    private final Production30_384 production = new Production30_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}