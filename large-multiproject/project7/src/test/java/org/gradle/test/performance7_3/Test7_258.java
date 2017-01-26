package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_258 {
    private final Production7_258 production = new Production7_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}