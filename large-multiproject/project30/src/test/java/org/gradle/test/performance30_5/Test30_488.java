package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_488 {
    private final Production30_488 production = new Production30_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}