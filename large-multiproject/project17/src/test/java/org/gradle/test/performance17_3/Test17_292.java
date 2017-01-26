package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_292 {
    private final Production17_292 production = new Production17_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}