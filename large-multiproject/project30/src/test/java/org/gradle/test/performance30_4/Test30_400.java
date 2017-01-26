package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_400 {
    private final Production30_400 production = new Production30_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}