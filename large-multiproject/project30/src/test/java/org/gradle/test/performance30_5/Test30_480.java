package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_480 {
    private final Production30_480 production = new Production30_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}