package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_318 {
    private final Production30_318 production = new Production30_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}