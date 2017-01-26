package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_384 {
    private final Production7_384 production = new Production7_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}