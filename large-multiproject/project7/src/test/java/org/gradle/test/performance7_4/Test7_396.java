package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_396 {
    private final Production7_396 production = new Production7_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}