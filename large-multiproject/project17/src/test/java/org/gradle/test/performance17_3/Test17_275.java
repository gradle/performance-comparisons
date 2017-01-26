package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_275 {
    private final Production17_275 production = new Production17_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}