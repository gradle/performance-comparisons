package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_414 {
    private final Production17_414 production = new Production17_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}