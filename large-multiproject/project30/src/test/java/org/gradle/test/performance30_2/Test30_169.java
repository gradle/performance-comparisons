package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_169 {
    private final Production30_169 production = new Production30_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}