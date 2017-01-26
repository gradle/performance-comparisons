package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_407 {
    private final Production17_407 production = new Production17_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}