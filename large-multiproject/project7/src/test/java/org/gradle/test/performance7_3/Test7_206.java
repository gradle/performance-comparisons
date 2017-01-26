package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_206 {
    private final Production7_206 production = new Production7_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}