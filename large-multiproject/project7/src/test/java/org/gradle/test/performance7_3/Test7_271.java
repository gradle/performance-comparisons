package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_271 {
    private final Production7_271 production = new Production7_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}