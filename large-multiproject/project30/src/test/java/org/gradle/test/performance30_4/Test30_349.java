package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_349 {
    private final Production30_349 production = new Production30_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}