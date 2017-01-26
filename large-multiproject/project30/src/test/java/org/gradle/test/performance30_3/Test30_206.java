package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_206 {
    private final Production30_206 production = new Production30_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}