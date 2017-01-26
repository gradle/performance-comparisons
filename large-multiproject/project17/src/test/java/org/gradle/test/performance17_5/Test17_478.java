package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_478 {
    private final Production17_478 production = new Production17_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}