package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_396 {
    private final Production30_396 production = new Production30_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}