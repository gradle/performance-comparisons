package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_295 {
    private final Production7_295 production = new Production7_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}